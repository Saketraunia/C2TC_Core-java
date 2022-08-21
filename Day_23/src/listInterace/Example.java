package listInterace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List <String> st=new ArrayList<>();
	    st.add( "saket");
        st.add("manish");
        st.isEmpty();
        st.add("monika");
        st.add("shubham");
        st.add(0, "from");
        System.out.println(st);
        Iterator e=st.iterator();
        while(e.hasNext()) {
        	System.out.println(e.next());
        }
	}

}
