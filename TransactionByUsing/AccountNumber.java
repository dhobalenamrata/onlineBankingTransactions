package com.nit.TransactionByUsing;

public class AccountNumber {
	private String accNo = "XX1515";

	public void setNo(String no) {
		accNo = no;
	}

	@Override
	public String toString() {
		return "AccountNumber : " + accNo ;
	}
	
	
}
