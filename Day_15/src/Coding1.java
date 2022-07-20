class plz {
	int a;
	String name;
	float f;
	
public plz(int x, String abc, float fl) {
	a=x;
	name=abc;
	f=fl;
		System.out.println("user defined  no argument constructer");
	}
void display() {
	System.out.println(a+" "+name+" "+f);
}}
public class Coding1 {
	public static void main(String arg[]) {
		plz s1=new plz(1,"xyz",234f);
		s1.display();
		
	}
}


