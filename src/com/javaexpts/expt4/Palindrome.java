package com.javaexpts.expt4;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter string to check if it is palindrome");
        String palindrome = sc.nextLine();
        String reverse = "" ;
        for (int i = palindrome.length() - 1 ; i >=0 ; i--) {
            reverse += palindrome.charAt(i);
        }
        int palindromic = reverse.compareToIgnoreCase(palindrome);
        if (palindromic == 0 )
            System.out.println("The String entered is palindrome");
        else
            System.out.println("The String entered is not a palindrome");
    }
}
