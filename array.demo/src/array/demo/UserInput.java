package array.demo;

import java.util.Scanner;
public class UserInput {
	public static void  main(Stringa args[]) {
		Scanner n =new Scanner(System.in);
		System.out.println(" entern the number of element");
		int num=n.nextInt();
		//System.out.println(num);
		int[] arr=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=n.nextInt();
		}
		for (int j=0;j<=num;j++) {
			System.out.print(arr[j]);
		}
}
} 