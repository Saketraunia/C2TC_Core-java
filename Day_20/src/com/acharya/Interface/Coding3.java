package com.acharya.Interface;

interface Interface1

{

public void myMethod();

}

interface Interface2

{

public void myMethod();

}

class work implements Interface1, Interface2

{

public void myMethod()

{

System.out.println("Implementing more than one interfaces");

}
}
public class Coding3{
public static void main(String args[])

{

work obj = new work();

obj.myMethod();

} }




