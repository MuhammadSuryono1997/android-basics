package com.yono.androidbasic.numberthree;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.yono.androidbasic.MainActivity;
import com.yono.androidbasic.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberThree extends AppCompatActivity {

    EditText username, password;
    Button btn_login;
    String t_username, t_password;
    private ProgressDialog pDialog;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.button_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkLogin();
            }
        });
    }

    private void checkLogin() {
        t_username = username.getText().toString();
        t_password = password.getText().toString();


        if (t_username.equalsIgnoreCase("")) username.setError("Can't empty");
        else if (t_password.equalsIgnoreCase("")) password.setError("Can't empty");
        else if (!isValidEmail(t_username)) username.setError("Input must be email");
        else if (!isValidPassword(t_password)) password.setError("Input must be Alphanumeric and length must be 8 characters");
        else{
            pDialog = new ProgressDialog(this);
            pDialog.setCancelable(false);
            pDialog.setMessage("Berhasil login");

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            finish();
            pDialog.show();
            startActivity(intent);
        }
    }

    public boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

    public boolean isValidPassword(String pass){
        String regex = "^(?=.*[A-Za-z-0-9])(?=.*\\d)[A-Za-z-0-9\\d]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }

}
