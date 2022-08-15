package iheritance.com;
import java.io.*;
import java.lang.*;
import java.util.*;
  
class Myself {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class Yourself extends Myself {
    public void print_for() {
    	System.out.println("for"); }
}
// Driver class
public class Inheritance1 {
    public static void main(String[] args)
    {
    	Yourself g = new Yourself();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}


