package com.nit.BankAccount;

public class InsufficiantBalanceException extends Exception{
	public InsufficiantBalanceException(){
		
	}
	public InsufficiantBalanceException(String msg){
		super(msg);
	}
}
