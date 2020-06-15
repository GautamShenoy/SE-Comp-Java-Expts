package com.javaexpts.practice;


public class VectorsTest {
    public static void main(String[] args) {
        Vectors stack = new Vectors();
        stack.push("gautam");
        stack.push(5);
        stack.push(1.100);
        stack.push(true);
        System.out.println("Popped  : " + stack.pop());
        System.out.println("Peek element : " + stack.peek());
        System.out.println("Elements : ");
        stack.display();
    }
}
