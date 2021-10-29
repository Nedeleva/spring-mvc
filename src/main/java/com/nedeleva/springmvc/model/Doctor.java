package com.nedeleva.springmvc.model;

public class Doctor {
    private int id;
    private String fullName;
    private String position;
    private int age;

    public Doctor() {
    }

    public Doctor(int id, String fullName, String position, int age) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName) {
        this.fullName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
