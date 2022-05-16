package com.example.dhktpm15a_nhom18_loc_quanliduan;

import java.util.Date;

public class Project
{
    public final String name;
    public final float description;
    public final Date startDate;
    public final Date endDate;


    public Project(final String name, float progress, Date startDate, Date endDate)
    {
        this.name = name;
        this.description = progress;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
