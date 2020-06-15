package com.javaexpts.practice;
import java.util.*;

public class Vectors {
    protected Vector<Object> vector;
    protected int top ;
    Vectors () {
        this.vector = new Vector<Object>();
        this.top = -1;
    }
    protected boolean isEmpty () {
        if (top == -1)
            return true;
        return false;
    }

    protected void push ( Object obj) {
        top ++;
        vector.add(top,obj);
    }

    protected Object pop () {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        Object obj = vector.get(top);
        top --;
        return obj;
    }

    protected Object peek() {
        if (isEmpty()){
            System.out.println("Stack is empty ");
            return null;
        }
        return vector.get(top);
    }

    public void display() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for ( int i =0; i<=top; i++)
            System.out.println(vector.get(i));
    }
}
