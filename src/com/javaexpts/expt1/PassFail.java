package com.javaexpts.expt1;

public class PassFail {
    public static void main(String[] args) {
        int sub1 = 30;
        int sub2 = 15;
        int sub3 = 20;
        int sub4 = 0;
        int sub5 = 10;
        double average = ( sub1 + sub2 + sub3 + sub4 + sub5 ) / 5 ;
        System.out.println("Average : " + average );
        if ( average < 15 ) 
            System.out.println("FAILS");
        else
            System.out.println("PASSES");
    }
}