package com.javaexpts.expt2;
import java.util.Scanner;

public class HighAndLowStudMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int highest = 0 , sum = 0;
        System.out.println("Enter the marks of those subjects ");
        for ( int i = 0; i < n ; i ++) {
            array[i] = sc.nextInt();
            if ( array[i] > highest )
                highest = array[i] ;
            sum += array [i] ;
        }
        double average = sum / n ;
        System.out.println("Highest Marks : " + highest );
        System.out.println("Average Marks : " + average);
    }
}
