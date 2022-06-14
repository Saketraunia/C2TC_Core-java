package demo2;

public class Instant {
	int num;
	String name;
	void insert(int n,String s) {
		num=n;
		name=s;
	}
	void display() {
		System.out.println(" num="+num +"name="+name);
	}
	public static void main(String args[]) {
		Instant obj=new Instant();
		Instant obj1=new Instant();
		obj.insert(112, "rohan");
		obj1.insert(234, "mysef");
		obj.display();
		obj1.display();
	}
}
