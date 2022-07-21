import java.util.Scanner;
class saket{
	String subject;
	int score;
	saket(String subject,int score){
		this.subject=subject;
		this.score=score;
	}
	void show() {
		System.out.println("subject="+subject+" "+"  "+"score="+score );
	}
}
public class DemoTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String sub=sc.next();
		int marks=sc.nextInt();
		saket obj=new saket(sub,marks);
		obj.show();
		
		
		
		
	}
	

}
