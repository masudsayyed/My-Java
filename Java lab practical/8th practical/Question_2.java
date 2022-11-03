/* Write a java program to check if a particular element exist in a Linked List 
 * Name : Masud Sayyed
 * Date : 03-11-22
 */

package javacode;
import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList <String> Name = new LinkedList <String> ();
		Name.add("MANOJ");
		Name.add("REHAN");
		Name.add("ADARSH");
		Name.add("VIKRAM");
		Name.add("BHAKTI");
		Name.add("VISHAL");
		
		
        System.out.print("Enter a Student name :");
        String name = sc.nextLine();
        sc.close();
      		// Checks whether the Name  exists or not.
      	if (Name.contains(name.toUpperCase()))
      	{
    	  System.out.println(name.toUpperCase()+" is present in the linked list.");
      } 
      	else
      	{
    	  System.out.println(name.toUpperCase()+" is not present in the linked list.");
      }
	}

}
