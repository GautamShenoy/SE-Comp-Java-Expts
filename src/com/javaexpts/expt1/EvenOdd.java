package com.javaexpts.expt1;

public class EvenOdd {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 5;
        if ( var1 %2 == 0 )
            System.out.println("Var 1 is even : " + var1 );
        else
            System.out.println("Var 1 is odd : " + var1 );
        if ( var2 %2 == 0 )
            System.out.println("Var 2 is even : " + var2 );
        else
            System.out.println("Var 2 is odd : " + var2 );
    }
}