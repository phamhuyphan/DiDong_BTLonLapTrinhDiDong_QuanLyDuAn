package com.example.dhktpm15a_nhom18_loc_quanliduan;

import java.util.Date;

public class Project
{
    public final String name;
    public final Task[] listTask;
    public final float progress;
    public final Date startDate;
    public final Date endDate;


    public Project(final String name, Task[] listTask, float progress, Date startDate, Date endDate)
    {
        this.name = name;
        this.listTask = listTask;
        this.progress = progress;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
