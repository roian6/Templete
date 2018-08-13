package com.example.david0926.templete;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity{

    EditText id, password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_login:
                id = findViewById(R.id.login_id);
                password = findViewById(R.id.login_password);
                Toast.makeText(this, "Hello, "+id.getText().toString()+"!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_register:
                Toast.makeText(this, "YOU CANNOT PASS", Toast.LENGTH_SHORT).show();
                break;

        }




    }
}
