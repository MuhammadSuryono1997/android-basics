package com.yono.androidbasic.numberone;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.yono.androidbasic.R;

public class FirstActivity extends AppCompatActivity {

    String TAG_RESULT = "result";
    EditText textPassData;
    Button buttonGetTextPassData;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout_pass_data);

        textPassData = findViewById(R.id.text_pass_data);
        buttonGetTextPassData = findViewById(R.id.button_get_text_pass_data);


        buttonGetTextPassData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getText();
            }
        });
    }

    public void getText(){
        result = textPassData.getText().toString();
        if (result.equals("")){
            textPassData.setError("This fill is not empty");
        }else {
            Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
            intent.putExtra(TAG_RESULT, result);
            finish();
            startActivity(intent);
        }

    }
}