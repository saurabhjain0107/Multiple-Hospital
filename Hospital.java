package com.bridgelabz;

public class Hospital {
    String name;
    enum Department{
        Oncology,
        Neurology,
        Cardiology,
        Gynocology;
    }


    public Hospital(String name,Department x) {
        this.name = name;
    }

}
