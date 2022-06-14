package demo2;

public class LogicalSnippet {
	public static void main(String args[]) {
		LogicalSnippet obj=new LogicalSnippet();
		obj.start();
	}
	void start() {
		String stra="do";
		String strb=method(stra);
		System.out.println(":"+ stra + strb);
		}
	String method(String stra) {
		stra=stra+"good";
		System.out.println(stra);
		return "good";
		
	}

}
