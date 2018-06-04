package com.example.schlomo.text5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.schlomo.text6.R;


class Pop extends Activity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_win);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)( width*.8),(int)( height*.6 ));

        b1= findViewById(R.id.button);
        b2= findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4= findViewById(R.id.button4);
        b5= findViewById(R.id.button5);
        b6= findViewById(R.id.button6);
        final Intent intentM= new Intent(this, MissionActivity.class);
        final Intent intentH= new Intent(this, HelpActivity.class);
        final Intent intentI= new Intent(this, MissionActivity.class);
        final Intent intentS= new Intent(this, MissionActivity.class);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(intentM);
            }
        });b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(intentS);
            }
        });b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentI);
            }
        });b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Toast.makeText(Pop.this,"b5",Toast.LENGTH_SHORT).show();

            }
        });b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(intentH);
                startActivity(intentH);
            }
        });

    }
}
