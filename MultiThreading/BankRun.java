package com.javaexpts.practice;

import java.util.Scanner;

class MyThread implements Runnable {
    Account Account;
    static Bank bank = new Bank();
    private Scanner sc = new Scanner(System.in);

    MyThread (Account Account) {
        this.Account = Account;
    }

    @Override
    public void run () {
        bank.operation(Account);

    }
}


public class BankRun {
    public static void main(String[] args) {
        Account account1 = new Account(181105153, 150000, true);
        Account account2 = new Account(191105053, 150000, true);
        Account account3 = new Account(181105058, 175890, true);
        Account account4 = new Account(181105032, 14569, true);

        MyThread t1 = new MyThread(account1);
        Thread thread1 = new Thread(t1, "Account 1");
        MyThread t2 = new MyThread(account2);
        Thread thread2 = new Thread(t2, "Account 2");
        MyThread t3 = new MyThread(account3);
        Thread thread3 = new Thread(t3, "Account 3");
        MyThread t4 = new MyThread(account4);
        Thread thread4 = new Thread(t4, "Account 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
