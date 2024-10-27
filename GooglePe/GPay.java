package com.nit.GooglePe;

import com.nit.BankAccount.BankAccount;
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
		public synchronized void makePayment(Object obj,double amt) throws InvalidTrancation{
			if(obj instanceof QR && amt>0 && amt<acc.getBalance()){
				acc.setBalance(acc.getBalance() - amt);
				System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by GPay.");
				System.out.println("Remaining balace : "+acc.getBalance());
			}
			else if(obj instanceof UPIiD && amt>0 && amt<acc.getBalance()){
				double mp = acc.getBalance() - amt;
				acc.setBalance(mp);
				System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by GPay.");
				System.out.println("Remaining balace : "+acc.getBalance());
			}
			else if(obj instanceof MobileNumber && amt>0 && amt<acc.getBalance()){
				double mp = acc.getBalance()- amt;
				acc.setBalance(mp);
				System.out.println("Rs. "+amt+"/- sent succesfully to "+obj+", by GPay.");
				System.out.println("Remaining balace : "+acc.getBalance());
			}
			else if(obj instanceof AccountNumber && amt>0 && amt<acc.getBalance()){
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

//		public synchronized void makePayment(QR qr,double amt){
//			if(qr instanceof QR && amt>0 && amt<acc.getBalance()){
//				acc.setBalance(acc.getBalance() - amt);
//				System.out.println("Rs. "+amt+"/- sent succesfully to "+qr+", by GPay.");
//				System.out.println("Remaining balace : "+acc.getBalance());
//			}
//			else
//			{
//				System.err.println("The System is not able to pay "+amt+" amount.");
//			}
//		}
//		public synchronized void makePayment(UPIiD upi,double amt){
//			if(upi instanceof UPIiD && amt>0 && amt<acc.getBalance()){
//				double mp = acc.getBalance() - amt;
//				acc.setBalance(mp);
//				System.out.println("Rs. "+amt+"/- sent succesfully to "+upi+", by GPay.");
//				System.out.println("Remaining balace : "+acc.getBalance());
//			}
//			else
//			{
//				System.err.println("The System is not able to pay "+amt+" amount.");
//			}
//		}
//		public synchronized void makePayment(MobileNumber mobNo,double amt){
//			if(mobNo instanceof MobileNumber && amt>0 && amt<acc.getBalance()){
//				double mp = acc.getBalance()- amt;
//				acc.setBalance(mp);
//				System.out.println("Rs. "+amt+"/- sent succesfully to "+mobNo+", by GPay.");
//				System.out.println("Remaining balace : "+acc.getBalance());
//			}
//			else
//			{
//				System.err.println("The System is not able to pay "+amt+" amount.");
//			}
//		}
//		public synchronized void makePayment(AccountNumber accNo,double amt){
//			if(accNo instanceof AccountNumber && amt>0 && amt<acc.getBalance()){
//				double mp = acc.getBalance() - amt;
//				acc.setBalance(mp);
//				System.out.println("Rs. "+amt+"/- sent succesfully to "+accNo+", by GPay.");
//				System.out.println("Remaining balace : "+acc.getBalance());
//			}
//			else
//			{
//				System.err.println("The System is not able to pay "+amt+" amount.");
//			}
//		}
}
