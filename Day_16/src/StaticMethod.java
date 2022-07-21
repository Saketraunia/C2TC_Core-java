class StaticMethod{
	static String college="acharya";
	static void display() {
		college="ABC";
		System.out.println("college="+ college);
	}		

	public static void main(String args[]) {
		display();
	}

}
