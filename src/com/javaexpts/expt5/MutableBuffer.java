package com.javaexpts.expt5;

public class MutableBuffer {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Gautam");
        name.append(" Shenoy");
        System.out.println(name);
        String name2 = new String("Gautam");
        name2.concat("Shenoy");
        System.out.println(name2);
    }

}
