package com.javaexpts.expt6;
import java.util.*;

class Stack {
    private Vector<Object> vector;
    private int top;
    public Stack (){
        vector = new Vector<Object>();
        top = -1;
    }
    public void push( Object object ) {
        top ++ ;
        vector.add(top, object);
    }
    public boolean isEmpty() {
        if(top == -1)
            return true;
        else
            return false;
    }
    public Object pop() {
        if(isEmpty()){
            System.err.println("Stack Underflow");
            return null;
        }
        Object object = vector.remove(top);
        top --;
        return object;
    }
    public void peek() {
        if(isEmpty()) {
            System.out.println("Stack Empty");
            return ;
        }
        System.out.println("Element at top : " + vector.get(top));
    }
    public void display() {
        if( isEmpty() ) {
            System.out.println("Stack Empty");
            return;
        }
        for(int i = 0 ; i <= top ; i++ ){
            System.out.println("Data : " + vector.get(i));
        }
    }
}