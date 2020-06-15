package com.javaexpts.expt9;
import java.util.Scanner;

public class BankAccount {
    protected String name;
    protected double balance;
    protected long accountNumber;
    protected boolean accountOpen;

    BankAccount ( ) {
        this.name = "No name";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    BankAccount ( String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        //this.balance = balance;
    }

    public void setBalance (double balance) {
        this.balance += balance;
        System.out.println("Account activated with balance : " + this.balance + " Rs.");
    }

    public void openAccount () {
        System.out.println("Bank account successfully opened \nEnjoy Banking with us");
        this.accountOpen = true;
    }

    public void closeAccount () {
        System.out.println("Thank you for banking with us :)\nYour account with number " + this.accountNumber + " will" +
                "be closed by the next 24 hrs. All facilities discontinued until then");
        this.accountOpen = false;
    }

    public void withdrawAmount (double amount) {
        Scanner sc = new Scanner(System.in);
        if (amount > this.balance) {
            System.out.println("Insufficient Balance \nCan withdraw only : " + this.balance +" Rs.");
            System.out.println("Do you wish to exhaust your balance anyway ? (1: Yes and 2: No)");
            int choice = sc.nextInt();
            if ( choice == 1){
                this.balance -= amount;
                System.out.println("Withdrawal Successful");
                System.out.println("Available Balance : " + this.balance + " Rs.");
            }
            else {
                System.out.println("Withdrawal Failed");
                System.out.println("Enter an amount less then balance available");
            }
        }
        else {
            System.out.println("Withdrawal Successful :)");
            this.balance  -= amount;
            System.out.println("Available balance : " + this.balance + " Rs.");
        }
    }

    public void depositAmount (double amount) {
        this.balance += amount;
        System.out.println("Deposit Successful");
        System.out.println("New Balance : " + this.balance + " Rs.");
    }

    public boolean getOpenAccount () {
        return this.accountOpen;
    }

    public void showBalance() {
        System.out.println("Available balance : " + this.balance + " Rs.");
    }

}
