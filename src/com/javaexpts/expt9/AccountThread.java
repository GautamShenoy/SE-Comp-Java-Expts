package com.javaexpts.expt9;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountThread extends Thread implements Runnable {
	private Person person;
	
	public AccountThread(Person p) {
		this.person=p;
	}

	public static void main(String[] args) {
		Person p1=new Person("Person 1");
		Person p2=new Person("Person 2");
		Person p3=new Person("Person 3");
		
		AccountThread t1=new AccountThread(p1);
		AccountThread t2=new AccountThread(p2);
		AccountThread t3=new AccountThread(p3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				Account acc=Account.getAccount(person);
				acc.withdrawal(900);
				try {
					Thread.sleep(200);
				}catch(InterruptedException ex) {
					Logger.getLogger(AccountThread.class.getName()).log(Level.SEVERE,null,ex);
				}
				if(Account.getBal()<=500) {
					System.out.println("Account has reached it's minimum limit");
				}
				acc.deposit(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Final Balance is: "+Account.getBal()+"\n");
		}
	}

}
