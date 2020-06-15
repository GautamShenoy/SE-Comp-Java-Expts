package com.javaexpts.expt1;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements ");
        for ( int i = 0; i < n ; i ++)
            array[i] = sc.nextInt();
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        for ( int i = 0 ; i < n ; i ++) {
            if (element == array[i]){
                System.out.println("Element found at position : " + ( 1+i ) );
                break;
            }
        }
    }
}
