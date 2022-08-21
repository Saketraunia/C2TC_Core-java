package listInterace;

import java.util.LinkedList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List li=new LinkedList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add("saket");
		System.out.println(li);
		for(Object i: li) {
			System.out.println(i);
		}

	}

}
