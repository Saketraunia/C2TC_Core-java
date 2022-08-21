
public class Test {
	public static void main (String args [])
	{
		Test obj =new Test();
		obj.start();
		String a="plz";
		obj.method(a);
		
	}
	void start() {
		String stra="do";
		System.out.println(":"+ stra);
		}
	String method(String stra) {
		stra=stra+"good";
		System.out.println(stra);
		return "good";
		
	}
}
