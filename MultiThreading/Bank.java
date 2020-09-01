package com.javaexpts.practice;

import java.util.Scanner;

public class Bank {
    private final Scanner sc = new Scanner(System.in);
    public synchronized void operation (Account account) {
        System.out.println("********* " + Thread.currentThread().getName() + " *********");
        System.out.println("What is your Desired operation ?");
        System.out.println("1. Balance Check\n2. Withdraw\n3. Deposit\n4. Close Account");
        while (true) {
            int choice = sc.nextInt();
            if (account.open == false){
                System.out.println("Account Closed");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Your Account Balance : " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount");
                    int amount = sc.nextInt();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter amount");
                    amount = sc.nextInt();
                    account.deposit(amount);
                    break;
                case 4:
                    System.out.println("Are you sure ?? (1 -> Yes\n2->No )");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        account.closeAccount();
                    } else {
                        System.out.println("Account Account not Closed");
                    }
                    break;
                default:
                    System.out.println("Unsupported Operation");
            }
            System.out.println( account.getAccountNumber() +" : Any more operations ? (1-> Yes 2-> No)");
            choice = sc.nextInt();
            if (choice == 1) {
                Thread.yield();
                continue;
            }
            else {
                System.out.println("Thanks for Accounting\nVisit Again");
                break;
            }
        }
    }
}

class SuperClass {
    private int var2 = 10;
    public int var1 = 20;
    protected int var3 = 24;
    public void display() {

    }
}



class SubClass extends SuperClass {
    //super.var1 = 20  --> error  why ??
    @Override
    public void display() {
        super.display();
        super.var1 = 20;
    }

    public int var1 = 40;

}