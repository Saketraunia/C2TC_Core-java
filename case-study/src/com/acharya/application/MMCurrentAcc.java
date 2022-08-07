package com.acharya.application;

import com.acharya.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	 public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	public void  withdraw(float creditlimit) {
		System.out.println(" dear account holder your account bal"+ getAccBal()+" the minimuun Balance Required is"+creditlimit);

		 
		 
	 }
	 
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	 

}
