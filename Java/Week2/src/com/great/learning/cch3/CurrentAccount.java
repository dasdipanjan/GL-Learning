package com.great.learning.cch3;

public class CurrentAccount extends Account {
	private int currentBalance;

	public CurrentAccount(String customerName, int accountNo, int currentBalance) {
		super(customerName, accountNo);
		this.currentBalance = currentBalance;
	}
	
	public void display() {
		super.display();
		System.out.println("Current balance of account holder := "+currentBalance);
	}

}
