package com.javaexpts.expt7;

public class Manager extends Employee {
    protected String project;

    Manager (String name, double salary) {
        super(name,"Manager",salary);
    }

    public void setProject (String project) {
        this.project = project;
    }

    public String getProject () {
        return project;
    }

    @Override
    public void giveRaise(double hike) {
        salary += hike*2;
    }

}
