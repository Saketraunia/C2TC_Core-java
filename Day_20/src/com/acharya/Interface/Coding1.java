package com.acharya.Interface;

interface INF
{
	void method();	
}
class test implements INF
{
	 public void method() {
		System.out.println("saket");
	}
}
public class Coding1{
public static void main(String arg[] ){
	test obj=new test();
	obj.method();
}
}