package com.example.testfour;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Loggedin extends AppCompatActivity {
    TextView name,email;
    SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged_in);

        email = (TextView) findViewById(R.id.t2);
        name = (TextView) findViewById(R.id.t4);
        preferences = this.getSharedPreferences("MYPREFS", Context.MODE_PRIVATE);

        String mName = preferences.getString("name","ERROR getting name");
        String mEmail = preferences.getString("email","ERROR getting email");
        name.setText(mName);
        email.setText(mEmail);
    }
}
