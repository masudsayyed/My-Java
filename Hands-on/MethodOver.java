/*WAP to demonstrate on Method overloading concept of Arithmetic Addition.Take the input from the user*/
package myproject;

public class MethodOver {

	void add(int a, int b)
	{
		System.out.println("First method add: " + (a + b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Second method add: " + (a + b + c));
	}
	
	void add(int a, int b, int c, int d)
	{
		System.out.println("Third method add: " + (a + b + c + d));
	}
}
