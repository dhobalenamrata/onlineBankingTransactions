package com.nit.TransactionByUsing;

public class MobileNumber {
	private long mobNo = 7123456789L;

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "MobileNumber : " + mobNo;
	}
	
}
