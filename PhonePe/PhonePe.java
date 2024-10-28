package com.nit.PhonePe;

import com.nit.BankAccount.*;
import com.nit.BankAccount.InvalidTrancation;
import com.nit.TransactionByUsing.*;
public class PhonePe{
	static BankAccount acc;
	
	public PhonePe(BankAccount acc) {
		this.acc = acc;
	}
	
	@Override
	public String toString() {
		return "PhonePe Application.";
	}
	public synchronized void makePayment(Object obj,double amt) throws InvalidTrancation, NegativeAmountException, InsufficiantBalanceException{

		if(amt<0) {
			throw new NegativeAmountException("Negative amount can't be transfered.");
		}
		else if(amt>acc.getBalance()) {
			throw new InsufficiantBalanceException();
		}
		else {
			if(obj instanceof QR){
				acc.setBalance(acc.getBalance() - amt);
				System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by PhonePe.");
				System.out.println("Remaining balace : "+acc.getBalance());
			}
			else if(obj instanceof UPIiD){
				acc.setBalance(acc.getBalance() - amt);
				System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by PhonePe.");
				System.out.println("Remaining balace : "+acc.getBalance());
			}
			else if(obj instanceof MobileNumber){
				acc.setBalance(acc.getBalance() - amt);
				System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by PhonePe.");
				System.out.println("Remaining balace : "+acc.getBalance());
			}
			else if(obj instanceof AccountNumber){
				acc.setBalance(acc.getBalance() - amt);
				System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by PhonePe.");
				System.out.println("Remaining balace : "+acc.getBalance());
			}
			else
			{
				throw new InvalidTrancation("This is not a valid transaction.");
			}
		}
		
	}
	
}
