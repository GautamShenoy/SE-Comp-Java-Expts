package com.javaexpts.expt1;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in sorted order ");
        for ( int i = 0; i < n ; i ++)
            array[i] = sc.nextInt();
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        int flag = 0;
        int low = 0;
        int high = n-1;
        int mid = ( low + high ) / 2 ;
        while (low <= high ) {
            mid = ( low + high ) / 2 ;
            if (element == array[ mid ] ) {
                flag = 1 ;
                break;
            }
            else if ( element < array[ mid ] ) {
                high = mid - 1 ;
            }
            else {
                low = mid + 1;
            }
            mid = ( low + high ) / 2 ;
        }
        if ( flag == 1) {
            System.out.println("Element found  at pos : " + ( mid + 1 ) );
        }
        else
            System.out.println("Element not found");
    }
}
