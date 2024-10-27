package com.nit.PhonePe;
import java.util.Scanner;
import com.nit.TransactionByUsing.*;
import com.nit.BankAccount.BankAccount;
public class PhonePeUser {

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		BankAccount BA = new BankAccount("X1X1X1", 1500, 1010101010);
		PhonePe pay = new PhonePe(BA);
		QR qr = new QR();
		UPIiD upiId = new UPIiD();
		MobileNumber mobNo = new MobileNumber();
		AccountNumber accNo = new AccountNumber();
		System.out.println("\n----------------PhonePe Application-------------\n");
		System.out.println("1. Make payment by using QR");
		System.out.println("2. Make payment by using Mobile number");
		System.out.println("3. Make payment by using Account number");
		System.out.println("4. Make payment by using UPI id ");
		System.out.print("By what you are going to pay : ");
		int src = sc.nextInt();
		System.out.print("How amount you are going to pay : ");
		double amt = sc.nextDouble();
		
//		switch (src) {
//		case 1:
//			pay.makePayment(qr, amt);
//			break;
//		case 2:
//			pay.makePayment(mobNo, amt);
//			break;
//		case 3:
//			pay.makePayment(accNo, amt);
//			break;
//		case 4:
//			pay.makePayment(upiId, amt);
//			break;
//		default :
//			System.out.println("You have not selected a proper option to pay.");
//		}
	
	System.out.println("\n1. Check remaining balance ");
	System.out.println("2. Check history ");
	System.out.print("Enter the input here : ");
	int check = sc.nextInt();
	
	switch(check) {
	case 1:
		System.out.println("Your remaining balance is : "+BA.getBalance());
		break;
	case 2:
		switch (src) {
		case 1:
			System.out.println("Sent Rs. "+amt+"/- from account number "+BA.getAccNo()+" to QR of UPIiD "+qr);
			break;			
		case 2:
			System.out.println("Sent Rs. "+amt+"/- from account number "+BA.getAccNo()+" to mobile number"+mobNo);
			break;
		case 3:
			System.out.println("Sent Rs. "+amt+"/- from account number "+BA.getAccNo()+" to Account number "+accNo);
			break;
		case 4:
			System.out.println("Sent Rs. "+amt+"/- from account number "+BA.getAccNo()+" to UPI ID "+upiId);
		}	
	}
	
	
		
	
		
		
		
	}
}
