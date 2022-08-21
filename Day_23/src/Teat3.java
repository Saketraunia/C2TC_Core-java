
public class Teat3 {
	String name;
	public static void main(String[] args) {
	Test3 c1 = new Test3();
	c1.name = " C2TC ";
	Test3 c2 = c1;
	c1 = null;
	System.out.println(c2.name);
	new Test3();
	Test3 c3;
	c3.name = " C2TC ";
	System.out.println(c3.name);}}


