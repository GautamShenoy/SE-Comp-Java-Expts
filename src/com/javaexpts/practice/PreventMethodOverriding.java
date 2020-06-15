package com.javaexpts.practice;

public class PreventMethodOverriding {
    final void test() {
        System.out.println("base class final method");
    }

    private void test1() {
        System.out.println("base class private method");
    }

    public static void test2() {
        System.out.println("base class static method");
    }

}
