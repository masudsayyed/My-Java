/* write a java program to compare two sets and retain elements which are same on both sets.(Using retainAll method)
 * Name : Masud Sayyed
 * Date : 03-11-22
 */

package javacode;

import java.util.*;

public class Question_3 {

	public static void main(String[] args) {
		HashSet<String> Name_1 = new HashSet<String>();
	     // use add() method to add values in the hash set
		Name_1.add("MANOJ");
		Name_1.add("VIKRAM");
		Name_1.add("REHAN");
		Name_1.add("SHIVAM");
	    System.out.println("Frist Name Set content: "+Name_1);
	          
	          HashSet<String>Name_2 = new HashSet<String>();
	          Name_2.add("MANOJ");
	          Name_2.add("ADARSH");
	          Name_2.add("VISHAL");
	          Name_2.add("SHIVAM");
	  		  
	          System.out.println("Second Name Set content: "+Name_2);
	          Name_1.retainAll(Name_2);
	          System.out.print("Common Elements : ");
	          System.out.println(Name_1);

	}

}
