package quad.c.r.rapid_charge_quad_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        View.OnClickListener listnr = new View.OnClickListener() {                        //Set a Listener on Button
            @Override
            public void onClick(View v) {

                Intent i= new Intent(Start.this,MainActivity.class);                   //Switches the Activity if the Button is pressed

                startActivity(i);
            }
        };

        ImageButton btn = (ImageButton)findViewById(R.id.imageButton);          //Button declaration
        btn.setOnClickListener(listnr);
    }
}
