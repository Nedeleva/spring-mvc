package com.nedeleva.springmvc.model;

public class Patient {
    private int id;
    private String fullName;
    private int age;

    public Patient() { }

    public Patient(int id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
