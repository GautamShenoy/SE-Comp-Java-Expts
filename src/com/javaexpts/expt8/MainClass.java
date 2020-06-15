package com.javaexpts.expt8;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name, branch, dateOfJoin;
        long ecNo, roll;
        int age;
        System.out.println("Enter name and Age for Person Class");
        name = sc.nextLine();
        age = sc.nextInt();
        Person person = new Person(name,age);
        person.display();
        System.out.println("Enter name and Age for Student class");
        name = sc.nextLine();
        name = sc.nextLine();
        age = sc.nextInt();
        System.out.println("Enter Student roll Number and Branch" );
        roll = sc.nextLong();
        branch = sc.nextLine();
        branch = sc.nextLine();
        Student student = new Student(name,age,roll,branch);
        student.display();
        System.out.println("Enter name and Age for Staff Class");
        name = sc.nextLine();
        age = sc.nextInt();
        System.out.println("Enter Ec No. and Date of joining (DD\\MM\\YYYY)");
        ecNo = sc.nextLong();
        dateOfJoin = sc.nextLine();
        dateOfJoin = sc.nextLine();
        Staff staff = new Staff(name,age,ecNo,dateOfJoin);
        staff.display();
        System.out.println("Enter name and Age for Faculty Class");
        name = sc.nextLine();
        age = sc.nextInt();
        System.out.println("Enter Ec No. and Date of joining (DD\\MM\\YYYY)");
        ecNo = sc.nextLong();
        dateOfJoin = sc.nextLine();
        dateOfJoin = sc.nextLine();
        Faculty faculty = new Faculty(name,age,ecNo,dateOfJoin);
        faculty.display();
    }
}
