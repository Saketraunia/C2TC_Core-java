package iheritance.com;

import java.io.*;
import java.lang.*;
import java.util.*;
  
class one {
    public void print()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one {
    public void printfor() 
    { System.out.println("for"); }
}
  
class three extends two {
    public void geek()
    {
        System.out.println("Geeks");
    }
}
  
// Drived class
public class Inheritance2{
    public static void main(String[] args)
    {
    	Inheritance2 abc =new Inheritance2();
        abc.geek();
        abc.printfor();
        print();
    }
}



