package demo2;

class Student {
	int rollno;
	String name;
	void insert(int r,String n) {
		rollno=r;
		name=n;
	}
	void display () {
		System.out.println(rollno +" "+ name);
	}
}
public class Bymethod{
	public static void main(String args[]){
		Student s1=new Student();
		Student s2=new Student();
		s1.insert(111, "saket");
		s2.insert(223, "karan");
		s1.display();
		s2.display();
	}
}
		
		
		
	
	

}
