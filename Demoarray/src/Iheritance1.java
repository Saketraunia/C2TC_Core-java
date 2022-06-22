class Person {
	void eat()
	{
		System.out.println("eating ");
		
	}
}
class boy extends Person {
	void run()
	{
		System.out.println("playing");
		
	}
}
public class Iheritance1{
	public static void main(String args[]) {
		boy d=new boy();
		d.eat();
		d.run();
		
		
	}
	


}
