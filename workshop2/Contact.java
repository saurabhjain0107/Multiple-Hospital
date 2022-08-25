package com.bridgelabz.workshop2;

public class Contact {
    private String name;
    private int age;
    private String phoneNumber;
    private String city;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Contact() {
    }

    public Contact(String name, int age, String phoneNumber, String city, String state) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
    }
    //    public Contact() {
//        this.name = name;
//        this.age = age;
//        this.phoneNumber = phoneNumber;
//        this.city = city;
//        this.state = state;
//    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("welcome to address book");
    }
}
