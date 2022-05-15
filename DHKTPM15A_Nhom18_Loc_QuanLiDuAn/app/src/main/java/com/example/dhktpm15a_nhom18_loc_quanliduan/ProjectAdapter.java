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

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent)
//    {
//        // Get the data item for this position
//        Project item = getItem(position);
//
//        ViewHolder holder;
//
//        // Check if an existing view is being reused, otherwise inflate the view
//
//        if (convertView == null)
//        {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.project_layout,
//                    parent, false);
//
//            holder = new ViewHolder();
//            holder.projectName = (TextView) convertView.findViewById(R.id.projectName);
//            holder.projectBar = (ProgressBar) convertView.findViewById(R.id.projectBar);
//            holder.projectValue = (TextView) convertView.findViewById(R.id.projectValue);
//            convertView.setTag(holder);
//        }
//        else
//        {
//            holder = (ViewHolder)convertView.getTag();
//        }
//
//        holder.projectName.setText(item.name);
//
//        holder.projectBar.set;
//        holder.projectBar.;
//
//        String fraction = String.format(FRACTION_FORMAT, item.current, item.max);
//
//        holder.projectValue.setText(fraction);
//
//        return convertView;
//    }
}
