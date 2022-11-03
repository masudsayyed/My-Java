/* Write a java program to replace the second element of a ArrayList with the specified element 
 * Name : Masud Sayyed.
 * Date : 03-11-22
 */
package javacode;

import java.util.*;

	public class Question_1 {

		public static void main(String args[]) {
			ArrayList<String>  Name = new ArrayList<String>();

			Name.add("Manoj");
			Name.add("Vikram");
			Name.add("Vishal");
			Name.add("Shivam");

			  System.out.println("Original array list: " + Name);
			  
			  String obj1 = "Aditiya";
			  
			  Name.set(1,obj1);
			  System.out.println("New array list: " + Name);	  

	}
}