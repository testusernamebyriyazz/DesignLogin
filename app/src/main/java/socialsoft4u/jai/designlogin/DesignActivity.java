package socialsoft4u.jai.designlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.nex3z.notificationbadge.NotificationBadge;

public class DesignActivity extends AppCompatActivity {


    NotificationBadge mbadge;

    LinearLayout Events,Products,Member,Demo;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);



        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EventsActivity.class));
                overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
            }
        });


        Events = (LinearLayout) findViewById(R.id.event);
        Products  = (LinearLayout) findViewById(R.id.product);
        Member =  (LinearLayout) findViewById(R.id.member);
        Demo =  (LinearLayout) findViewById(R.id.demo);
        Products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ProductActivity.class));
                overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
            }
        });


        mbadge = (NotificationBadge)findViewById(R.id.badge);

        mbadge.setNumber(++count);

    }




}
