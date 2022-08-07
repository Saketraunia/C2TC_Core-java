package com.acharya.client;

import com.acharya.application.MMBankFactory;
import com.acharya.application.MMCurrentAcc;
import com.acharya.application.MMsavingAcc;
import com.acharya.framework.BankFactory;
import com.acharya.framework.CurrentAcc;
import com.acharya.framework.SavingAcc;
public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa= new  MMsavingAcc(201, "saket",2000, true);
		CurrentAcc ca= new MMCurrentAcc (301, "manish",2500);
        bf.deposit(bf.getaccBal());
        bf.toString();
        ca.withdraw(ca.get());
        ca.toString();
        
	}

}
