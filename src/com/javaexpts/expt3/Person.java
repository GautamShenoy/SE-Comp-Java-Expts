package com.javaexpts.expt3;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private double salary;

    public void setData (String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public void showData () {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Salary : " + this.salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter name , age and Salary");
        String name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble() ;
        person.setData(name,age,salary);
        person.showData();
    }
}
