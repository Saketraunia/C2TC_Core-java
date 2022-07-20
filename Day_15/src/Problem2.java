class employee{
	int income;
	String name;
	float expenese;
	public employee(int income, String name, float expenese) {
		System.out.println("User defined no argument constructor");
	}
void display()
{
		System.out.println(income+"  "+name+" "+expenese );
	}
}
public class Problem2 {
	public static void main(String args[]) {
	employee a1=new employee(234,"saket",345f);
	employee a2=new employee(567,"sanskar",543f);
	a1.display();
	a2.display();
	}
}
