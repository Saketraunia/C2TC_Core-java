package com.acharya.Interface;

interface car{
	void getmileage();
}
class speed implements car{
	public void getmileage() {
		System.out.println(" RACING CAR");
	}
}
public class Coding2 {
public static  void main (String arg[]) {
	speed obj1=new speed();
	obj1.getmileage();
	
		
	}

}
