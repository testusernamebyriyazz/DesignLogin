package socialsoft4u.jai.designlogin;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


/**
 * Created by Jai on 16-09-2017.
 */

public class BackgroundWorker extends AsyncTask<String,Void,String> {

    Context context;
    String type;

    public BackgroundWorker(Context ctx){
        context = ctx;
    }


    String testurl;

    @Override
    protected String doInBackground(String... params) {
        testurl = "http://saikapyar.in/demoabout.php";

        type = params[0];

        if(type.equals("check")){

            try {
                URL url = new URL(testurl);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);



//            OutputStream outputStream = httpURLConnection.getOutputStream();
//            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
//            String Data = URLEncoder.encode("","UTF-8") +"="+ URLEncoder.encode("","UTF-8");
//            bufferedWriter.write(Data);
//            bufferedWriter.flush();
//            bufferedWriter.close();

                //read response from php file

                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result = "";
                String line = "";
                if((line =  bufferedReader.readLine())!= null){
                    result += line;
                }
                inputStream.close();
                bufferedReader.close();
                return result;

            } catch (IOException e) {
                e.printStackTrace();
            }

        }





        return null;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String result) {
        //Toast.makeText(context,result,Toast.LENGTH_SHORT).show();
    }

}
