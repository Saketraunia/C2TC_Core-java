class demo{
	demo(){
		System.out.println(" a hello");
	}
	demo(int x){
		this();
		System.out.println(x);
	}
}
public class pratice {
	public static void main(String args[]) {
		demo obj=new demo(23);
	}
}
