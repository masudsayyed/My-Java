/*
  write a program to iterate ArrayList.
  Name : Masud Sayyed.
*/
package corejavabasic;

import java.util.*;

class Array_List_1 {

	public static void main(String ... args)
	{
	
		ArrayList<String> students = new ArrayList<>();
		students.add("Adarsh");
		students.add("Gaurav");
		students.add("Pranay");
		students.add("Vikram");
		
		System.out.println("ArrayList is: " + students);
		
		Iterator<String> stud = students.iterator();
		System.out.print("ArrayList using iterator: ");
		while(stud.hasNext())
		{
			System.out.print(stud.next());
			System.out.print(", ");
		}
	}
}
