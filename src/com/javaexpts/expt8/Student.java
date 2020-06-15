package com.javaexpts.expt8;

public class Student extends Person implements Interface{
    protected long rollNo ;
    protected String branch;

    Student () {
        super();
        this.rollNo = 0;
        this.branch = "Branchless";
    }

    Student(String name, int age, long roll, String branch) {
        super(name,age);
        this.branch = branch;
        this.rollNo = roll;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll Number : "+ this.rollNo );
        System.out.println("Branch : " + this.branch );
    }

}
