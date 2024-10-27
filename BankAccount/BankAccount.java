package com.nit.BankAccount;

public class BankAccount {
	private double balance;
	private String accNo;
	private long mobNo;
	public BankAccount(String accNo, double balance, long mobNo) {
		if(balance>2500) {
			this.balance = balance;
			this.accNo = accNo;
			this.mobNo = mobNo;
		}
		else {
			System.err.println("Initial balance must be more then Rs. 2500/-. ");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Account Number : " + accNo + "\nMobile Number : " + mobNo + "\nCurrent Balance : "+balance;
	}	
}
