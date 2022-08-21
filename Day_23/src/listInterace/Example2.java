package listInterace;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		ArrayList <Object> li=new ArrayList<>();
		li.add("345");
		li.add(0, "first");
		System.out.println(li.contains("345"));	
		li.size();
		ArrayList <Object> sa=new ArrayList<>();
		sa.addAll(li);
		sa.containsAll(li);
		System.out.println(li);
		System.out.println(sa);

	}

}
