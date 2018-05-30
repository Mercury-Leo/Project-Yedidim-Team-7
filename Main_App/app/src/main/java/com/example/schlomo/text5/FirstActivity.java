package com.example.schlomo.text5;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.schlomo.text6.R;

public class FirstActivity extends AppCompatActivity {

    ImageButton enter;
    EditText code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        enter = findViewById(R.id.imageButton3);
        code = findViewById(R.id.editText);
        final Intent intent = new Intent(this, InscriptionActivity.class);
        final Intent intent2 = new Intent(this, MapsActivity.class);
        final Intent intent3 = new Intent(this, ScoresActivity.class);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.setText("");
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(code.getText());
                int numCode = -1;
                try {
                    numCode = Integer.parseInt(code.getText().toString());
                } catch (Exception e) {
                    System.out.println("נא להכניס קוד קבוצה !!");
                    numCode=-1;
                }
                if (numCode != -1) {
                    if (numCode < 999 || numCode > 99999)
                        System.out.println(" קוד קבוצה לא נכון !!");
                    else if (numCode < 10000) {
                        System.out.println("is a player");
                        startActivity(intent2);
                        finish();
                    } else {
                        System.out.println("is a team head ");
                        startActivity(intent);
                    finish();
                    }

                }
                else
                startActivity(intent2);
finish();
            }
        });
    }
}

