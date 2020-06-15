package com.javaexpts.expt2;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt() ;
        int count = 0 , sum = 0;
        int duplicate = n ;
        while ( n > 0) {
            count +=1 ;
            n = n/10;
        }
        n = duplicate ;
        while ( n > 0) {
            int rem = n % 10 ;
            sum += Math.pow(rem,count);
            n = n/10;
        }
        if (sum == duplicate )
            System.out.println("The number : " + duplicate + " is an Armstrong Number");
        else
            System.out.println("The number : " + duplicate + " is not an Armstrong Number");
    }
}
