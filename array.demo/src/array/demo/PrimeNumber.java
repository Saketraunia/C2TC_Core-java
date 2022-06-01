package array.demo;

import java.util.Scanner;
public class PrimeNumber {
	public static void  main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i=1;i<=num;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
		for(int k=i;k<=num;k++) {
			System.out.print("*"); 
		}
		System.out.println();
		
		
	}
	
	
	}
}
