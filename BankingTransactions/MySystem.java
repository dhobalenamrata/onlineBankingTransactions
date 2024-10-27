package com.nit.BankingTransactions;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.nit.BankAccount.BankAccount;
import com.nit.BankAccount.InvalidTrancation;
import com.nit.GooglePe.GPay;
import com.nit.PhonePe.PhonePe;
import com.nit.TransactionByUsing.*;

public class MySystem implements Runnable{
	static Scanner sc = new Scanner(System.in);
	private Object transactionBy;
	private Object transactionTo;
	private double amount;
	
	public void setTransactionBy(Object transactionBy) {
		this.transactionBy = transactionBy;
	}
	public void setTransactionTo(Object transactionTo) {
		this.transactionTo = transactionTo;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	// Method to deciding by what we are doing payments.
	public int makeTransactions(Object obj) {
		
		//Second phase of output to deciding by what we are doing payments. 
		System.out.println("\n----------------"+obj+"-------------\n");
		System.out.println("1. Make payment by using QR");
		System.out.println("2. Make payment by using Mobile number");
		System.out.println("3. Make payment by using Account number");
		System.out.println("4. Make payment by using UPI id ");
		System.out.print("By what you are going to pay : ");
		int src = sc.nextInt();
		
		return src;
	}
	@Override
	public void run() {
		if(transactionBy instanceof PhonePe) {
			try {
				((PhonePe) transactionBy).makePayment(transactionTo, amount);
			} catch (InvalidTrancation e) {
				System.err.println(e.getMessage());
			}
		}
		else if(transactionBy instanceof GPay) {
			try {
				((GPay) transactionBy).makePayment(transactionTo, amount);
			} catch (InvalidTrancation e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
		}
		else {
			System.err.println("The object you have provided is not a type of any Banking Transaction App.");
			
		}
		
	}

	public static void main(String[] args) {
		BankAccount BA = new BankAccount("1x1x1x", 3500, 1010101010); 
		PhonePe pPay = new PhonePe(BA);
		GPay gPay = new GPay(BA);
		
		QR qr = new QR();
		UPIiD upiId = new UPIiD();
		MobileNumber mobNo = new MobileNumber();
		AccountNumber accNo = new AccountNumber();
		
		
		MySystem ms1 = new MySystem();
		int transactionSrc = 0;
		// Initial phase of Output
		System.out.println("********* Online Transaction App *********");
		int choice;
		do {
			System.out.println("------------------------------------------");
			System.out.println("\t1. PhonePe");
			System.out.println("\t2. GPay");
			System.out.println("\t3. Check Bank Details");
			System.out.println("\t4. exit");
			System.out.println("------------------------------------------");
			System.out.print("Select your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("You have selected "+pPay+" App.");
				transactionSrc = ms1.makeTransactions(pPay);
				ms1.setTransactionBy(pPay);
				break;
			case 2:
				System.out.println("You have selected "+gPay+" App.");
				transactionSrc = ms1.makeTransactions(gPay);
				ms1.setTransactionBy(gPay);
				break;				
			case 3:
				System.out.println("*******Your Bank Details*******");
				System.out.println(BA);
			}
			
			Thread th1 = new Thread(ms1);
			
			if(transactionSrc>0 && transactionSrc<=4) {
				switch(transactionSrc){
				case 1:
					ms1.setTransactionTo(qr);
					break;
					
				case 2:
					ms1.setTransactionTo(mobNo);
					break;
				case 3:
					ms1.setTransactionTo(accNo);
					break;
				case 4:
					ms1.setTransactionTo(upiId);
					break;
			}
				if(choice == 1 || choice==2)
				{
					System.out.print("How much amount you want to Pay : ");
					double amt = sc.nextDouble();
					ms1.setAmount(amt);
					th1.start();
					try {
						th1.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ms1.setTransactionBy(null);
					ms1.setTransactionTo(null);
				}
			}			
		}
		while(choice != 4 && (choice>0 && choice<4)); 
	}
}
