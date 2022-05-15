package com.example.dhktpm15a_nhom18_loc_quanliduan;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainScreen extends AppCompatActivity {
    private final static String TAG = "Xem dự án";
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
}