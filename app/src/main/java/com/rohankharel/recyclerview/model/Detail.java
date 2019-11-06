package com.rohankharel.recyclerview.model;

public class Detail {
    private String name;
    private String age;
    private String gender;
    private int imageId;

    public Detail(String name, String age, String gender, int imageId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}


