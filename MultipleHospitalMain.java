package com.bridgelabz;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleHospitalMain {
    public static void main(String[] args) {
        Map<String, Hospital> hospitalMap = new HashMap<>();
        Hospital patient = new Hospital();
        Hospital firstHospital = new Hospital();
        firstHospital.addPatient();
        System.out.println(firstHospital.patientList);
        Hospital secondHospital = new Hospital();
        secondHospital.addPatient();
        System.out.println(secondHospital.patientList);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter patient name to edit");
        String name = sc.next();
        firstHospital.editPatient(name);
        System.out.println(patient);
        hospitalMap.put("bhopal",patient);

    }
}
