package com.bridgelabz;

import java.util.ArrayList;

import java.util.Scanner;

public class Hospital {
     ArrayList<Patient> patientList = new ArrayList<>();
    Patient patient;

    void addPatient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hospital name:");
        String hospitalName = sc.next();
        System.out.println("enter department->1=Oncology//2=Cardiology//3=Neurology//4=Gynocology");
        String department = sc.next();
        Patient patient = new Patient();
        patient.setHospitalName(hospitalName);
        patient.setDepartment(department);
        System.out.println("enter name");
        String name = sc.next();
        patient.setName(name);
        System.out.println("enter age");
        int age = sc.nextInt();
        patient.setAge(age);
        System.out.println("enter phone Number");
        long phoneNumber = sc.nextInt();
        patient.setPhoneNumber(phoneNumber);
        System.out.println("enter city");
        String city = sc.next();
        patient.setCity(city);
        System.out.println("enter state");
        String state = sc.next();
        patient.setState(state);
        patientList.add(patient);
    }

    void addPatient(Patient patient){
        patientList.add(patient);
    System.out.println("patient added in patientlist");
}
    void editPatient(String name){
        for(Patient patient : patientList){
            if(patient.getName().equalsIgnoreCase(name)){
                Scanner str = new Scanner(System.in);
                System.out.println("enter patient name");
                String name1 = str.next();
                patient.setName(name1);
                System.out.println("enter patient hospital name");
                String hospitalName1 = str.next();
                patient.setHospitalName(hospitalName1);
                System.out.println("enter patient department");
                String department1 = str.next();
                patient.setDepartment(department1);
                System.out.println("enter patient age");
                int age1 = str.nextInt();
                patient.setAge(age1);
                System.out.println("enter patient phoneNumber");
                long phoneNumber1 = str.nextInt();
                patient.setPhoneNumber(phoneNumber1);
                System.out.println("enter patient city");
                String city1 = str.next();
                patient.setCity(city1);
                System.out.println("enter patient state");
                String state1 = str.next();
                patient.setState(state1);
                System.out.println("patient updated");
                patientList.add(patient);
                break;

            }
        }
    }

}
