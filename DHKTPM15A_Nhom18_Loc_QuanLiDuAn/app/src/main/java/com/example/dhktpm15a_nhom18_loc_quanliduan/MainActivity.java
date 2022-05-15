package com.example.dhktpm15a_nhom18_loc_quanliduan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = findViewById(R.id.btn_signInFirstScreen);
        btnRegister = findViewById(R.id.btn_RegisterFirstScreen);

        btnSignIn.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SignIn.class));
        });

        btnRegister.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Register.class));
        });
    }
}