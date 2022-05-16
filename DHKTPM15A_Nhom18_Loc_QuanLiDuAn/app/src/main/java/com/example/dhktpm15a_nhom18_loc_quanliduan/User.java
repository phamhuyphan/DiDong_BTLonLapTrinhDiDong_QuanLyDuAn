package com.example.dhktpm15a_nhom18_loc_quanliduan;


public class User {

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

    public String getEmail() {
        return description;
    }

    public void setEmail(String email) {
        this.description = email;
    }

    public String getImg() {
        return img;
    }

    public User(String name, String description, String img) {
        this.name = name;
        this.description = description;
        this.img = img;
    }

    public User(String name, String description, String img, String key) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.key = key;
    }

    public User() {
    }
}
