package com.acharya.Interface;

interface write1{
	void write();
}
interface read1 {
	void read();
}
class AKA implements write1,read1{
	public void read() {
		System.out.println("write");
	}
	public void write() {
		System.out.println("read");
	}
}
public class Coding5 {
	public static void main(String args[]) {
		AKA mac=new AKA();
		mac.write();
		mac.read();
	}

}
