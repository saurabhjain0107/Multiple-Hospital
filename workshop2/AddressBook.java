package com.bridgelabz.workshop2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();

    void addContacts() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name");
        String name = scan.next();
        System.out.println("enter age");
        int age = scan.nextInt();
        System.out.println("enter phoneNumber");
        String phoneNumber = scan.next();
        System.out.println("enter city");
        String city = scan.next();
        System.out.println("enter state");
        String state = scan.next();
        Contact contact = new Contact();
        contact.setName(name);
        contact.setAge(age);
        contact.setPhoneNumber(phoneNumber);
        contact.setCity(city);
        contact.setState(state);
        contactList.add(contact);
    }
}
