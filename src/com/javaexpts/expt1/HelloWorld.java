package com.javaexpts.expt1;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        int var1 = 10;
        int var2 =20;
        System.out.println("Sum : " + ( var1 + var2 ) );
        int sub1 = 39, sub2 = 19, sub3 = 69, sub4 = 99, sub5 = 59 ;
        double average = ( sub1 + sub2 + sub3 + sub4 + sub5 ) / 5 ;
        if (average < 15 )
            System.out.println("Fail");
        else
            System.out.println("Pass");
        if (var1 % 2 == 0 )
            System.out.println("Number 1 : " + var1 + " is Even ");
        else
            System.out.println("Number 1 : " + var1 + " is Odd ");
        if (var2 % 2 == 0 )
            System.out.println("Number 2 : " + var2 + " is Even ");
        else
            System.out.println("Number 2 : " + var2 + " is Odd ");
        System.out.println("Enter a number for multiplication table : ");
        int user_inp = sc.nextInt();
        for (int i = 1 ; i <= 10 ; i ++)
            System.out.println(user_inp + " * " + i + " = " + (user_inp * i ) );
    }
}
