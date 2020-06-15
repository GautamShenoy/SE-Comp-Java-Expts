package com.javaexpts.practice;

public interface Interfaces {
    int var = 10;
    default void method() {
        System.out.println("Method definition inside interface");
        System.out.println(var);
    }
    void method2();

}
