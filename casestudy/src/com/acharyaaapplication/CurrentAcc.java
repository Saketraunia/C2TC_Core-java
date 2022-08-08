package com.acharyaaapplication;

public abstract class CurrentAcc extends BankAcc{
	private final float creditlimit=500.0f;
	
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal) {
	

}
	@Override
	public String toString() {
		return "CurrentAcc [creditlimit=" + creditlimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
