package iheritance.com;

interface write1{
	void write();
}
interface read1 {
	void read();
}
class AKA implements write1,read1{
	public void read() {
		System.out.println(" write");
	}
	public void write() {
		System.out.println("read");
	}
}
public class basiciheritance {

}
