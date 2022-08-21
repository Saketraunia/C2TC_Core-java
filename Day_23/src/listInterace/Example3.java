package listInterace;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Object> obj=new ArrayList<>();
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println(obj.subList(0, 2));
	}

}
