package demo2;

public class Reference_Variable {
	String name;
	int id;
	public static void main(String args[]) {
		Reference_Variable a=new Reference_Variable();
		a.name="john";
		System.out.println(a.name);
		System.out.println(a.id);
		a.id=100;
		System.out.println(a.id);
	}

}
