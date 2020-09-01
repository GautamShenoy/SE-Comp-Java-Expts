package com.javaexpts.practice;

public class Account {
    private int balance ;
    public boolean open;
    private int accountNumber;

    Account (int accountNumber, int balance, boolean open) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.open = open;
    }

    public synchronized void withdraw (int amount ) {
        if (!this.open) {
            System.out.println("Cant perform operation on closed Account");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
            System.out.println("Available Balance : " + this.balance);
        }
        else {

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.balance -= amount;
            System.out.println("withdrawal Successful");
        }
    }

    public void deposit (int amount ){
        if (!this.open) {
            System.out.println("Cant perform operation on closed Account");
            return;
        }
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.balance += amount;
        System.out.println("Successfully Deposited amount to your account");
        System.out.println("New Balance : " + this.balance );
    }

    public int getBalance () {
        return this.balance;
    }

    public void closeAccount() {
        this.open = false;
    }

    public int getAccountNumber () {
        return accountNumber;
    }
}
