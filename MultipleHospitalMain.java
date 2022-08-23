package com.bridgelabz;


import java.util.Scanner;

public class MultipleHospitalMain {
    static int patientID;

    public static void main(String[] args) {
        MultipleHospitalMain multiplepatient = new MultipleHospitalMain();
        Patient patient1 = multiplepatient.createPatient();
        System.out.println(patient1);

    }

    Patient createPatient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter patient name:");
        String name = sc.next();
        System.out.println("enter patient age :");
        int age = sc.nextInt();
        System.out.println("enter phoneNumber :");
        int phoneNumber = sc.nextInt();
        System.out.println("enter city");
        String city = sc.next();
        System.out.println("enter state :");
        String state = sc.next();
        Patient patient = new Patient(name, age, phoneNumber, city, state);
        return patient;
    }
}
