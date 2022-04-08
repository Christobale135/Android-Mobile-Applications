package com.food.fast.fastfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText name = (EditText)findViewById(R.id.name);
        final EditText password = (EditText)findViewById(R.id.password);
        Button login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("admin") && password.getText().toString().equals("pass123"))
                {
                    startActivity(new Intent(Login.this, Home.class));
                }
                else if (name.getText().toString() != "admin" && password.getText().toString() != "pass123")
                {
                    Toast.makeText(getApplicationContext(), "Username/password is incorrect", Toast.LENGTH_LONG).show();
                    name.getText().clear();
                    password.getText().clear();
                }
            }
        });
    }
}
