/*
Question- create a class parent with default constructor and
          void sing method.
          print something inside the constructor and method
          Create child class which will inherit the property of parent and has
          methods void speak and void dance.
          print something inside the two methods.
          Create another class inheritance and object of class and call all the methods.
          also mention the type of inheritance on the top of the program.
Name - Masud Sayyed.
Date - 06/10/2022.
This is simple inheritance
*/
package inheritance;
//main class to print
public class Inheritance {
	//main methode.
	public static void main(String args[])
	{
		//making object of child class
		Child c = new Child();
		
		//calling methods
		c.sing();
		c.speak();
		c.dance();
	}

}
