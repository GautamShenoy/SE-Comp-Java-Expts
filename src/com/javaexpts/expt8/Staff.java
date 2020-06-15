package com.javaexpts.expt8;

public class Staff extends Employee implements Interface {

    Staff () {
        super();
    }

    Staff (String name, int age, long ecNo, String doj) {
        super(name,age,ecNo,doj,"Staff");
    }

    @Override
    public void display() {
        super.display();
    }

}
