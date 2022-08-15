package iheritance.com;

class Vehicle {
	void good() {
		System.out.println(" running");
	}
}
class car extends Vehicle{
	void fast() {
		System.out.println("Car milege is 45km/hr");
	}
}
class truck extends Vehicle{
	void slow() {
		System.out.println(" truck milege is 15km/hr");
	}
}
public class Hierarachical {
	public static void main(String args[]) {
		truck re=new truck();
		car rs=new car();
		re.good();
		re.slow();
		rs.fast();
		
	}

}
