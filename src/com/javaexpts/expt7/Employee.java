package com.javaexpts.expt7;

public abstract class Employee {
    protected String name;
    protected String designation;
    protected double salary;

    Employee () {
        this.name = "no name";
        this.designation = "no designation";
        this.salary = 0.0;
    }
    Employee (String name , String designation , double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public abstract void giveRaise ( double hike );

    public String getName () {
        return name;
    }

    public String getDesignation () {
        return designation;
    }

    public double getSalary () {
        return salary;
    }
}
