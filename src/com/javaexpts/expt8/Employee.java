package com.javaexpts.expt8;

public class Employee extends Person implements Interface{
    protected long ecNo;
    protected String dateOfJoining;
    protected String designation;

    Employee () {
        super();
        this.ecNo = 0;
        this.dateOfJoining = "00\\00\\0000";
        this.designation = "no designation";
    }

    Employee (String name, int age, long ecNo, String doj, String designation) {
        super(name, age);
        this.designation = designation;
        this.dateOfJoining = doj;
        this.ecNo = ecNo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Designation : " + this.designation);
        System.out.println("Date of joining : " + this.dateOfJoining);
        System.out.println("Ec No : " + this.ecNo);
    }
}
