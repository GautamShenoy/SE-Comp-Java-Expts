package com.javaexpts.practice;

public class MethodOverridingTest extends PreventMethodOverriding {
    //@Override
    public void test1() {
        System.out.println("derived class test1");
    }

    public static void test2() {
        System.out.println("derived class test2");
    }

    public static void main(String[] args) {
        MethodOverridingTest mt = new MethodOverridingTest();
        mt.test1();
        mt.test2();

        PreventMethodOverriding pv = new PreventMethodOverriding();
        pv.test();
        pv.test2();
        //pv.test1();

    }
}
