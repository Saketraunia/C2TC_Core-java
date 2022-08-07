package com.acharya.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditlimit=3000.0f;
	
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float creditlimit) {
		System.out.println(" your creditlimit in account"+creditlimit);
	

}
	
	public float getCreditlimit() {
		return creditlimit;
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditlimit=" + creditlimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}



