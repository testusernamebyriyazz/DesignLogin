package socialsoft4u.jai.designlogin;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    public EditText Ed_Name,Ed_Email,Ed_Phone,Ed_Password;
    public Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Ed_Name = (EditText)findViewById(R.id.login_name);
        Ed_Email = (EditText)findViewById(R.id.login_emailid);
        Ed_Phone = (EditText)findViewById(R.id.login_phone);
        Ed_Password = (EditText)findViewById(R.id.login_password);

        btn_register = (Button)findViewById(R.id.register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = Ed_Name.getText().toString();
                String Email = Ed_Email.getText().toString();
                String Phone = Ed_Phone.getText().toString();
                String Password = Ed_Password.getText().toString();


                if(Name.equals("")){
                    Ed_Name.requestFocus();
                    //Toast.makeText(getApplicationContext(),"Please enter your name",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter your name...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                }
                else if(Name.length() < 2){
                    //Toast.makeText(getApplicationContext(),"Please enter atleast name",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter atleast name", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else if(Email.equals("")){
                    Ed_Email.requestFocus();
                    //Toast.makeText(getApplicationContext(),"Please enter your email address",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter your email address...", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
                    //Toast.makeText(getApplicationContext(),"Please enter valid email address",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter valid email address", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                else if(Phone.equals("")){
                    Ed_Phone.requestFocus();
                    //Toast.makeText(getApplicationContext(),"Please enter your mobile number",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter your mobile number", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else if(Phone.length()< 10){
                    //Toast.makeText(getApplicationContext(),"Please enter atleast 10 digit mobile number",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter atleast 10 digit mobile number", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else if(Password.equals("")){
                    Ed_Password.requestFocus();
                    //Toast.makeText(getApplicationContext(),"Please enter your password",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter your password", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else if(Password.length() < 4){
                    //Toast.makeText(getApplicationContext(),"Please enter atleast 4 characters in password",Toast.LENGTH_SHORT).show();
                    Snackbar.make(view, "Please enter atleast 4 characters in password", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else
                {
                    Toast.makeText(getApplicationContext(),"success...",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(getApplicationContext(),MainActivity.class));

        //overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
        finish();


    }
}
