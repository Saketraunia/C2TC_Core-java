class student {
	String name;
	int rollno;
	student(){
		name="saket";
		rollno=1234;
		System.out.println("User defined non argument constructor");
		}
}
public class Coding3 {
	public static void main(String args[]) {
		student s1=new student();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
	}

}
