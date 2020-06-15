package com.javaexpts.expt6;
import java.util.Scanner;
import java.lang.*;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice;
        Object data;
        while(true) {
            System.out.println("1 : Push 2 : Pop 3 : Peek 4 :  Display 5 : Exit");
            choice = sc.nextInt();
            switch(choice) {
                case 1 :
                    System.out.println("Enter your data");
                    data = sc.nextLine();
                    data = sc.nextLine();
                    stack.push(data);
                    break;
                case 2 :
                    data = stack.pop();
                    System.out.println("Element deleted : " + data);
                    break;
                case 3 :
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                default :
                    System.out.println("Please enter correct choice :)");
            }
        }
    }
}