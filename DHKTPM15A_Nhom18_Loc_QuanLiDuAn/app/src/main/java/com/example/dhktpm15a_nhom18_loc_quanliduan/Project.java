package com.example.dhktpm15a_nhom18_loc_quanliduan;


public class Project {

    private String name;
    private String description;
    private String img;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Project(String name, String description, String img) {
        this.name = name;
        this.description = description;
        this.img = img;
    }

    public Project() {
    }
}
