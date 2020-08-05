package com.yono.androidbasic.numbertwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.yono.androidbasic.R;

public class SecondActivity extends AppCompatActivity {

    Button buttonResultActivity;
    String resultSecond;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        buttonResultActivity = findViewById(R.id.button_second_layout);
        resultSecond = getIntent().getStringExtra("result_second");

        if(resultSecond != null){
            Toast.makeText(getApplicationContext(),resultSecond,Toast.LENGTH_LONG).show();
        }

        buttonResultActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }
}
