package com.java.vishal.abstractiondemo;

public class Driver {
	public static void main(String[] args) {
		Bank b=new bankimpl(); 
		
		Account acc1=new Account(10,"Vishal",86000,b);
		
		b.deposit(acc1, 10000);
		System.out.println(acc1);
		
		b.deposit(acc1, 30000);
		
		b.withdraw(acc1, 20000);
		System.out.println(acc1);
		
		
		b.withdraw(acc1, 45000);
		System.out.println(acc1);
		
	}
	}
