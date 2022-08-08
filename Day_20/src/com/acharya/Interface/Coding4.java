package com.acharya.Interface;

interface veh{
	void display();
}
interface bik extends veh{
	void getmilege();
}
class S12 implements bik{
	public void display() {
		System.out.println("2");
	}
	public void getmilege(){
		
		System.out.println("1");
	}

}
public class Coding4 {
	public static void main(String args[]) {
		S12 sak=new S12();
		sak.display();
		sak.getmilege();
	}

}
