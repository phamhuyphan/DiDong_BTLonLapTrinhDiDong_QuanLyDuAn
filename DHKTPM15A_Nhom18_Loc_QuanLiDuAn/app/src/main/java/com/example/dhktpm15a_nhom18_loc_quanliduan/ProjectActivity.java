package com.example.dhktpm15a_nhom18_loc_quanliduan;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ProjectActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_activity);
    }

    @Override
    public void onResume()
    {
        super.onResume();
    }

    private void setupTotalEntry(final List<Project> budgets, final Project blankBudget)
    {

    }
}