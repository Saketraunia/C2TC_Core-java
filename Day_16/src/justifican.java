class deno{
	void method(deno a) {
		System.out.println("method is invoked");
	}
	void point() {
		method(this);
	}
	
}
public class justifican {
	public static void main(String args[]) {
		deno s1=new deno ();
		s1.point();
		
	}
	

}
