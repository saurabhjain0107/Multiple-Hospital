package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
ArrayList<Patient> patientList = new ArrayList<>();
    void addPatient(){
    Scanner sc = new Scanner(System.in);
    System.out.println("hospital name:");
    String hospitalName = sc.next();
    System.out.println("enter department->1=Oncology//2=Cardiology//3=Neurology//4=Gynocology");
    String department = sc.next();
    Patient patient1 = new Patient();
    patient1.setHospitalName(hospitalName);
    patient1.setDepartment(department);
    System.out.println("enter name");
    String name = sc.next();
    patient1.setName(name);
    System.out.println("enter age");
    int age = sc.nextInt();
    patient1.setAge(age);
    System.out.println("enter phone Number");
    long phoneNumber = sc.nextInt();
    patient1.setPhoneNumber(phoneNumber);
    System.out.println("enter city");
    String city = sc.next();
    patient1.setCity(city);
    System.out.println("enter state");
    String state = sc.next();
    patient1.setState(state);
   patientList.add(patient1);

}

}
