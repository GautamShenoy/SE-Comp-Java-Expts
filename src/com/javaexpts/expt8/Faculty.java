package com.javaexpts.expt8;

public class Faculty extends Employee implements Interface {

    Faculty () {
        super();
    }

    Faculty (String name, int age, long ecNo, String doj ) {
        super(name,age,ecNo,doj,"Faculty" );
    }

    @Override
    public void display() {
        super.display();
    }

}
