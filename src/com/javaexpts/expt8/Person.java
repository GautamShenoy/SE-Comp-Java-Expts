package com.javaexpts.expt8;

public class Person implements Interface{
    protected String name;
    protected int age;

    Person () {
        this.name = "no name";
        this.age = 0;
    }

    Person ( String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

}
