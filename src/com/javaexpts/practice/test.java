package com.javaexpts.practice;
class Parent {
    int a=40;
    int b=20;
}
public class test extends Parent {
    int a=100;
    int b=200;
    void add(int a,int b) {
//body
        System.out.println(super.a+super.b);
    }
    public static void main(String[] args) {
        test c = new test();
        c.add(1000,2000);
    }
}