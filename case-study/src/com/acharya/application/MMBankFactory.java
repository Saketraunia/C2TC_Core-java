package com.acharya.application;

import com.acharya.framework.BankFactory;
import com.acharya.framework.CurrentAcc;
import com.acharya.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMsavingAcc mmsaving= new MMsavingAcc(AccNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent =new MMCurrentAcc(AccNo, accNm, creditLimit);
		return mmcurrent;
	}
	

}
