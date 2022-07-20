class just{
	int roll_no;
	String name;
	float salary;
public just(int roll_no, String name, float salary) {
		this.roll_no = roll_no;
		this.name = name;
		this.salary = salary;
	}
void display() {
	System.out.println(roll_no+" "+name+" "+salary);
}}
public class Problem1 {
	public static void main(String args[]) {
		just a1=new just(21,"saket",233f);
		just a2=new just(23,"manish",2347f);
		a1.display();
		a2.display();
		
	}
}

