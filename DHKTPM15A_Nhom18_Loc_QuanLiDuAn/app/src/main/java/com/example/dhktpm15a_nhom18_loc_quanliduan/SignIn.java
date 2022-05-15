package com.example.dhktpm15a_nhom18_loc_quanliduan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {
    Button btnSignIn;
    TextView txtUser, txtPass;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btnSignIn = findViewById(R.id.btn_Signin);
        txtUser = findViewById(R.id.textEmailLogin);
        txtPass = findViewById(R.id.textPassLogin);
        mAuth = FirebaseAuth.getInstance();

        btnSignIn.setOnClickListener(v -> {
            checkSignInData();
        });
    }

    private void checkSignInData() {
        txtUser.setText("user@gmail.com");
        txtPass.setText("123456");
        String email = txtUser.getText().toString();
        String password = txtPass.getText().toString();

        if(email.isEmpty()) {
            txtUser.setError("Vui lòng nhập email để đăng nhập !");
            txtUser.requestFocus();
        }
        else if(password.isEmpty()) {
            txtUser.setError("Vui lòng nhập password để đăng nhập !");
            txtUser.requestFocus();
        }
        else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()) {
                        Toast.makeText(SignIn.this, "Đăng nhập thành công !", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SignIn.this, MainScreen.class));
                    }
                    else {
                        Toast.makeText(SignIn.this, "Lỗi đăng nhập: " + task.getException().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}