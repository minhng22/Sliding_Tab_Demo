package com.example.administrator.myapp;

public class ClassGender {
    private String studentid = "";
    private String studentname = "";
    private boolean gender;

    public void setID (String id){ studentid = id; }

    public void setStudentName ( String name){ studentname = name; }

    public String getID() {return studentid;}

    public String getName() {return studentname;}

    public boolean isGender() {return gender;}

    public void setGender(boolean gender) {this.gender = gender;}

    public String toString() {
        return this.studentid+"     "+this.studentname;
    }
}
