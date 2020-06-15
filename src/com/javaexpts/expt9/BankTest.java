package com.javaexpts.expt9;
import java.util.*;

class OnlineThread extends Thread {
    BankAccount account;

    OnlineThread (BankAccount account) {
        this.account = account;
    }

    @Override
    synchronized public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Deposit Money \n2: Withdraw Money\n3: Close Account");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Enter the amount to be deposited ");
                double amount = sc.nextDouble();
                account.depositAmount(amount);
                break;
            case 2:
                System.out.println("Enter the Withdrawal Amount ");
                amount = sc.nextDouble();
                account.withdrawAmount(amount);
                break;
            case 3:
                System.out.println("Are you sure you want to close your Account ?? (1 : Yes , 2: No) ");
                choice = sc.nextInt();
                if (choice == 1)
                    account.closeAccount();
                else
                    System.out.println("Account cancellation aborted");
                break;
        }
    }
}

class OfflineThread extends Thread {
    BankAccount account;

    OfflineThread  (BankAccount account) {
        this.account = account;
    }

    @Override
    synchronized public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Deposit Money \n2: Withdraw Money\n3: Close Account");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Enter the amount to be deposited ");
                double amount = sc.nextDouble();
                account.depositAmount(amount);
                break;
            case 2:
                System.out.println("Enter the Withdrawal Amount ");
                amount = sc.nextDouble();
                account.withdrawAmount(amount);
                break;
            case 3:
                System.out.println("Are you sure you want to close your Account ?? (1 : Yes , 2: No) ");
                choice = sc.nextInt();
                if (choice == 1)
                    account.closeAccount();
                else
                    System.out.println("Account cancellation aborted");
                break;
        }
    }
}

public class BankTest {
    public static void main(String[] args) {

    }
}
