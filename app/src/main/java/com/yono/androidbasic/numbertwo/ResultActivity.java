package com.yono.androidbasic.numbertwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.yono.androidbasic.R;

public class ResultActivity extends AppCompatActivity {

    String TAG_RESULT_ON_BACK = "result_second";
    Button buttonGetOnBack;
    EditText textGetOnBack;
    String result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout_result);

        buttonGetOnBack = findViewById(R.id.button_get_text_second);
        textGetOnBack = findViewById(R.id.text_pass_data_second);

        buttonGetOnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getText();
            }
        });
    }

    public void getText(){
        result = textGetOnBack.getText().toString();
        if (result.equals("")){
            textGetOnBack.setError("This fill is not empty");
        }else {
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(TAG_RESULT_ON_BACK, result);
            finish();
            startActivity(intent);
        }

    }


}
