package socialsoft4u.jai.designlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nex3z.notificationbadge.NotificationBadge;

public class HomeScreen extends AppCompatActivity {

    NotificationBadge mbadge;
    Button inc,clr;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        mbadge = (NotificationBadge)findViewById(R.id.badge);

        inc = (Button)findViewById(R.id.increase);
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbadge.setNumber(++count);
            }
        });


        clr = (Button)findViewById(R.id.clear);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbadge.setNumber(0);
            }
        });

    }
}
