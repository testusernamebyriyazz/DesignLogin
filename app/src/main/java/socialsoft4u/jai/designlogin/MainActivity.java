package socialsoft4u.jai.designlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView reg;
    ImageButton log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        log = (ImageButton) findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DesignActivity.class));

                String type = "check";

                BackgroundWorker backgroundWorker = new BackgroundWorker(getApplicationContext());
                backgroundWorker.execute(type);

                overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);

            }
        });



        reg = (TextView)findViewById(R.id.register);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));

//                int randomPIN = (int)(Math.random()*9000)+1000;
//                String val = ""+randomPIN;

                overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);


                //Toast.makeText(getApplicationContext(),val,Toast.LENGTH_SHORT).show();


            }
        });
    }
}
