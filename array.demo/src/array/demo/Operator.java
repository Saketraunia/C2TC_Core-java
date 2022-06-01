package array.demo;

public class Operator
{
	public static void main(String[] arg)
	{
		int marks= 75;
		char grade;
		if (marks>= 90) {
			grade='a';
		}
		else if(marks>=80) {
			grade='B';
		}else if(marks>=70) {
			grade='c';
		}
		else {
			grade ='F';
			
		}
		
	
	System.out.println(" Your grade ="+ grade);
}
}

