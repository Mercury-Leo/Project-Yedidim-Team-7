package com.example.schlomo.text5;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Toast;
import com.example.schlomo.text6.R;
import org.json.JSONArray;

public class MissionActivity extends AppCompatActivity {
    ImageButton exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);


        exit = (ImageButton) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
//    LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    View view = inflater.inflate(R.layout.mylayout, null);
//    ScrollView scrollView = new ScrollView(this);
//scrollView.addView(view);
//
//    setContentView(scrollView);
//}
}