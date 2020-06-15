package com.javaexpts.practice;

abstract class interfaces{
    abstract void show();
}
interface class1 {
    void show();
}

interface class2 {
    default void show(){
        System.out.println("dfdff");
    }
    static void show1 () {
        System.out.println("static");
    }
}



public class EverythingOneClass implements class2{

    @Override
    public void show() {
        System.out.println("kkdkd");
    }

    public static void main(String[] args) {
        EverythingOneClass ome = new EverythingOneClass();
        ome.show();
    }
}
