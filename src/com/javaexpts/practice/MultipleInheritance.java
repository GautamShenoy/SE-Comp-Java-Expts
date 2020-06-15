package com.javaexpts.practice;

public class MultipleInheritance extends Vectors implements Runnables {

    @Override
    public void running() {

    }

    @Override
    public void method2() {

    }

    public void method() {
        System.out.println("Method definition inside main class");
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.method();
        System.out.println(Interfaces.var);
    }

}
