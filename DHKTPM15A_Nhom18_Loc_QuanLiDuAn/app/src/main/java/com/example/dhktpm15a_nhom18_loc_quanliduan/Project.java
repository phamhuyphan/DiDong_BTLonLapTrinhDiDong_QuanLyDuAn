package com.example.dhktpm15a_nhom18_loc_quanliduan;

import java.util.Date;

public class Project
{
    private String name;
    private String description;
    private String img;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setEmail(String email) {
        this.description = email;
    }

    public String getImg() {
        return img;
    }

    public Project(String name, String description, String img) {
        this.name = name;
        this.description = description;
        this.img = img;
    }

    public Project(String name, String description, String img, String key) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.key = key;
    }

    public Project() {
    }
}
