package array.demo;

import java.util.Scanner;
public class Mulitiplication {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value whose multiplication u  want to type");
		int var=sc.nextInt();
		for(int i=1;i<=10;i++) {
			long b = var*i;
			System.out.println(" multiplication of " + b);
		}
		
		
	}

}
