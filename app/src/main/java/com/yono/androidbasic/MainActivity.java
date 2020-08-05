package com.yono.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yono.androidbasic.numberone.FirstActivity;
import com.yono.androidbasic.numberthree.NumberThree;
import com.yono.androidbasic.numbertwo.SecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_pass = findViewById(R.id.pass_data_button);
        Button btn_on_back = findViewById(R.id.pass_on_back_button);
        Button btn_ui = findViewById(R.id.pass_ui_login_button);

        btn_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(intent);
            }
        });

        btn_on_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        btn_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumberThree.class);
                finish();
                startActivity(intent);
            }
        });
    }
}