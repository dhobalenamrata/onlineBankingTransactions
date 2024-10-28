package com.nit.GooglePe;

import com.nit.BankAccount.*;
import com.nit.BankAccount.InvalidTrancation;
import com.nit.TransactionByUsing.*;

public class GPay {
	static BankAccount acc;
		
		public GPay(BankAccount acc) {
			this.acc = acc;
		}
		
		@Override
		public String toString() {
			return "GPay Application.";
		}
		public synchronized void makePayment(Object obj,double amt) throws InvalidTrancation, InsufficiantBalanceException, NegativeAmountException{
			if(amt<0) {
				throw new NegativeAmountException("Newgative amount can't be transfered.");
			} else if(amt>acc.getBalance()) {
				throw new InsufficiantBalanceException();
			} else {
				if(obj instanceof QR){
					acc.setBalance(acc.getBalance() - amt);
					System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by GPay.");
					System.out.println("Remaining balace : "+acc.getBalance());
				}
				else if(obj instanceof UPIiD){
					double mp = acc.getBalance() - amt;
					acc.setBalance(mp);
					System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by GPay.");
					System.out.println("Remaining balace : "+acc.getBalance());
				}
				else if(obj instanceof MobileNumber){
					double mp = acc.getBalance()- amt;
					acc.setBalance(mp);
					System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by GPay.");
					System.out.println("Remaining balace : "+acc.getBalance());
				}
				else if(obj instanceof AccountNumber){
					double mp = acc.getBalance() - amt;
					acc.setBalance(mp);
					System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by GPay.");
					System.out.println("Remaining balace : "+acc.getBalance());
				}
				else
				{
					throw new InvalidTrancation("This is not a valid transaction.");
				}
			}
		}
}
