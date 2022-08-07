package com.acharya.framework;


	public abstract class SavingAcc extends BankAcc{ 
		private  boolean isSalary;
		private static final float MINBAL=500.0f;
		
		public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
			super(accNo, accNm, accBal);
			this.isSalary = isSalary;
		}

		public void withdraw(float accBal) {
			System.out.println(" the amount in your account"+accBal);
			
			
		}
		

		public boolean isSalary() {
			return isSalary;
		}

		public void setSalary(boolean isSalary) {
			this.isSalary = isSalary;
		}

		public static float getMinbal() {
			return MINBAL;
		}

		@Override
		public String toString() {
			return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		


	}

