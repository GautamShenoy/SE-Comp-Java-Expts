package com.javaexpts.expt7;

public class Worker extends Employee {

    Worker (String name , double salary) {
        super(name, "Worker", salary);
    }

    @Override
    public void giveRaise(double hike) {
        salary += hike ;
    }
}
