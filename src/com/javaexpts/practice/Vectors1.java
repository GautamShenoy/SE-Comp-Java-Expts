package com.javaexpts.practice;

import java.util.List;
import java.util.Vector;

public class Vectors1 {
    public static void main(String[] args) {
        List<Object> vector = new Vector<Object>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("Before removal : " + vector);
        vector.remove(1);
        vector.remove("1");
        System.out.println("After removal : " + vector);

    }
}
