package com.acharya.pratice;

class student{
	int b;//instance variable
	String nu;//instance variable
	void add(int a,String num) {
		 b=a;
		 nu=num;
	}
	void display() {
		System.out.println("a="+b +" num="+ nu);
	}
}
public class Example1 {
	public static void main(String args[]) {
		student s1=new student();//we are creating an object 
		s1.add(23, "sak");// we are call the method add
		s1.display();// we are call the method
		
	}
}
