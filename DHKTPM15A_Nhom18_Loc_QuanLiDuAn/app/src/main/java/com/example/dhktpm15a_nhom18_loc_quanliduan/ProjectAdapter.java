package com.example.dhktpm15a_nhom18_loc_quanliduan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

class ProjectAdapter extends ArrayAdapter<Project>
{
    private final String FRACTION_FORMAT;

    public ProjectAdapter(Context context, List<Project> items)
    {
        super(context, 0, items);

        FRACTION_FORMAT = context.getResources().getString(R.string.fraction);
    }

    static class ViewHolder
    {
        TextView projectName;
        ProgressBar projectBar;
        TextView projectValue;
    }
}
