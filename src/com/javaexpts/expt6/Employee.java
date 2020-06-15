package com.javaexpts.expt6;
import java.util.Scanner;


public class Employee {
    private String empCode ;
    private String name;
    private String DOB;
    private String dateOfJoin;
    private int designCode;
    private float salary;

    public void setData () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee Credentials :-");
        System.out.println("Enter your employee Code");
        this.empCode = sc.next();
        System.out.println("Enter your Name");
        this.name = sc.nextLine();
        this.name = sc.nextLine();
        System.out.println("Enter your Date of Birth (DD\\MM\\YYY)");
        this.DOB = sc.next();
        System.out.println("Enter Date of Joining this prestigious company :)");
        this.dateOfJoin = sc.next();
        System.out.println("Enter design code of your project");
        this.designCode = sc.nextInt();
        System.out.println("Enter your salary ");
        this.salary = sc.nextFloat();
    }

    public void showData () {
        System.out.println("Your Code : " + this.empCode);
        System.out.println("Your Name : " + this.name);
        System.out.println("Your DOB : " + this.DOB);
        System.out.println("Your company date of joining : " + this.dateOfJoin);
        System.out.println("Your project design code : " + this.designCode);
        System.out.println("Your Salary : " + this.salary);
    }

}
