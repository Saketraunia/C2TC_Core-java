import java.util.Scanner;
class demo1{
	int admissionNo;
	String name;
	static String collegename ="Acharya";
	public demo1(int admissionNo, String name) {
		this.admissionNo = admissionNo;
		this.name = name;
	}
	void show() {
		System.out.println("admissionNo="+admissionNo+" "+"name="+name+" "+"college name="+ collegename);
	}
}
public class StaticVariable {
	public static void main(String args[]) {
		Scanner sc=new  Scanner(System.in);
		int rollno1=sc.nextInt();
		String name1=sc.next();	
		int rollno2=sc.nextInt();
		String name2=sc.next();
		demo1 a1= new demo1( rollno1, name1);
		demo1 a2=new demo1(rollno2,name2);
		a1.show();
		a2.show();
		
		
	}

}
