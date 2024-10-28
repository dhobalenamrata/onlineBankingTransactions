package com.nit.BankAccount;

public class NegativeAmountException extends Exception{
	public NegativeAmountException(String msg){
		super(msg);
	}
}
