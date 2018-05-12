package com.example.schlomo.text5;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class InscriptionActivity extends AppCompatActivity {
    EditText telNum;
    ImageButton letGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        telNum = findViewById(R.id.tel);
        letGo = findViewById(R.id.letGo);
        final Intent intent = new Intent(this, MapsActivity.class);

        telNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telNum.setText("");
            }
        });

        letGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });


    }
}

