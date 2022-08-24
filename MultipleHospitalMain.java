package com.bridgelabz;


import java.util.HashMap;
import java.util.Map;

public class MultipleHospitalMain {
    public static void main(String[] args) {
        Map<String, Hospital> hospitalMap = new HashMap<>();
        Hospital firstHospital = new Hospital();
        firstHospital.addPatient();
        System.out.println(firstHospital.patientList);
        Hospital secondHospital = new Hospital();
        secondHospital.addPatient();
        System.out.println(secondHospital.patientList);
    }
}
