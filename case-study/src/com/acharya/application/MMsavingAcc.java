package com.acharya.application;

import com.acharya.framework.SavingAcc;

public class MMsavingAcc extends SavingAcc{
	
	private static final float MINBAL=300.0f;
	public MMsavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float MINBAL) {
		System.out.println(" dear account holder your account bal"+ getAccBal()+" the minimuun Balance Required is"+MINBAL);

	}
	
	public static float getMinbal() {
		return MINBAL;
	}

	
	@Override
	public String toString() {
		return "MMsavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	}

