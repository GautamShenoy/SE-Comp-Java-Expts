package com.javaexpts.expt9;

public class Account {
	public static Account account;
	public static int balance=6000;
	private static Person person;
	
	private Account() {
	}
	
	public static Account getAccount(Person p) {
		if(account==null) {
			account=new Account();
		}
		Account.person=p;
		return account;
	}
	public static int getBal() {
		return balance;
	}
	
	public synchronized void withdrawal(int amt) {
		try {
			if((balance-amt)>=500) {
				try {
					Thread.sleep(100);
				}catch(Exception e) {
					e.printStackTrace();
				}
				balance=balance-amt;
				System.out.println(person.getName()+" withdraws Rs. "+amt);
			}
			else
				System.out.println(person.getName()+" doesn't have enough balance");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void deposit(int dep) {
		try {
			if(dep>0) {
				try {
					Thread.sleep(100);
				}catch(Exception e) {
					e.printStackTrace();
				}
				balance=balance+dep;
				System.out.println(person.getName()+" deposits Rs. "+dep);
			}
			else
				System.out.println(person.getName()+" doesn't have enough amount to be deposited");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
