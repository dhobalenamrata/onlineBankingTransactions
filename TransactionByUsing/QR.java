package com.nit.TransactionByUsing;

public class QR extends UPIiD{
	private static String qr;
	private UPIiD upiId;

	public void setQr(String qr) {
		this.qr = qr;
	}

	@Override
	public String toString() {
		return "The QR Code of " + upiId +",  is " +qr ;
	}
	
}
