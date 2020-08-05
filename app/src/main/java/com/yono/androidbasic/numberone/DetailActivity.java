package com.yono.androidbasic.numberone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yono.androidbasic.MainActivity;
import com.yono.androidbasic.R;

public class DetailActivity extends AppCompatActivity {

    TextView resultText;
    Button buttonToMenu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_layout_detail);
        resultText = findViewById(R.id.text_result_detail);
        buttonToMenu = findViewById(R.id.button_back_to_menu);

        Intent intent = getIntent();
        resultText.setText(intent.getStringExtra("result"));

        buttonToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(i);
            }
        });
    }
}
