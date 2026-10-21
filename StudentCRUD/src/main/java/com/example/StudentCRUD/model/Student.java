package com.example.StudentCRUD.model;

public class Student {

    private int rno;
    private String name;
    private String english;

    public Student(int rno, String name, String english) {
        this.rno = rno;
        this.name = name;
        this.english = english;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}