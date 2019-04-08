package com.example.testfour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    String name, email, password;
    Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        etName = (EditText) findViewById(R.id.letName);
        etEmail = (EditText) findViewById(R.id.letEmail);
        etPassword = (EditText) findViewById(R.id.letPassword);
        btnRegister = (Button) findViewById(R.id.lbtnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = etName.getText().toString();
                email = etEmail.getText().toString();
                password = etPassword.getText().toString();
                String task = "register";
                BackgroundTask backgroundTask = new BackgroundTask(Register.this);
                backgroundTask.execute(task,name, email, password);
                finish();
            }
        });


    }
}
