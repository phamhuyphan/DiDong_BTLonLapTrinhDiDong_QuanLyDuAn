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

public class Register extends AppCompatActivity {
    Button btnReg;
    TextView txtEmail, txtPass, txtRepass;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnReg = findViewById(R.id.btn_register);
        txtEmail = findViewById(R.id.textEmailReg);
        txtPass = findViewById(R.id.textPassReg);
        txtRepass = findViewById(R.id.textRepassReg);
        mAuth = FirebaseAuth.getInstance();

        btnReg.setOnClickListener(v -> {
            checkRegisterData();
        });
    }
    private void checkRegisterData() {
        String email = txtEmail.getText().toString();
        String password = txtPass.getText().toString();
        String rePassword = txtRepass.getText().toString();

        if(email.isEmpty()) {
            txtEmail.setError("Vui lòng nhập email để đăng kí!");
            txtEmail.requestFocus();
        }
        else if(password.isEmpty()) {
            txtPass.setError("Vui lòng nhập password để đăng kí !");
            txtPass.requestFocus();
        }
        else if(rePassword.isEmpty()) {
            txtRepass.setError("Vui lòng nhập lại password để đăng kí !");
            txtRepass.requestFocus();
        }
        else if(!password.equals(rePassword)) {
            txtRepass.setError("Mật khẩu nhập lại không trùng nhau  !");
            txtRepass.requestFocus();
        }
        else {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()) {
                        Toast.makeText(Register.this, "Đăng kí thành công !", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Register.this, SignIn.class));
                    }
                    else {
                        Toast.makeText(Register.this, "Lỗi đăng kí: " + task.getException().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}