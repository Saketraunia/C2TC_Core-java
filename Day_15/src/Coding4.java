class company{
	int branch;
	String name;
	company(){
		branch=10;
		name="MNC Company";
		System.out.println("USER DEFINED NON ARGUMENT CONSTRUCTOR");
	}
	 company(int a,String n){
		 branch=a;
		 name=n;
		 System.out.println("USER DEFINED PARAMETERIZED CONSTRUCTOR");
	 }
	 void display() {
		 System.out.println("Branch="+branch+" "+"name="+name);
	 }
	
}
public class Coding4 {
	public static void main(String args[]) {
		company c1=new company();
		company c2=new company(34,"Capegmini");
		c1.display();
		c2.display();
		}

}
