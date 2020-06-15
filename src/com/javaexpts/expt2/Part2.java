package com.javaexpts.expt2;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to terminate ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2 ; i <= n ; i+=2) {
            if (i % 3 == 0)
                sum += i;
        }
        System.out.println("Sum of even nos divisible by 3 [0,n] : " + sum );
    }
}
