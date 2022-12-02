package com.great.learning.cch3;

public class AccountDetails extends CurrentAccount {
	private int depositAmount;
	private int withdrawalAmount;
	
	
	public AccountDetails(String customerName, int accountNo, int currentBalance, int depositAmount,
			int withdrawalAmount) {
		super(customerName, accountNo, currentBalance);
		this.depositAmount = depositAmount;
		this.withdrawalAmount = withdrawalAmount;
	}
	
	public void display() {
		super.display();
		System.out.println("Deposit Amount := "+depositAmount+"  "+"\n"+"Withdrawal Amount : "+withdrawalAmount);
	}
}
