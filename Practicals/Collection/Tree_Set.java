/*
 TreeSet interface that uses a tree for storage 
 it inherits abstract set class and implements navigible set interface
 the object of the tree set class are sorted in asscending order
 it contains unique elements and does not allow null values
*/
package corejavabasic;

import java.util.*;

class Tree_Set {

	public static void main(String[] args) {

			SortedSet<String> fruits = new TreeSet<>();
			fruits.add("Apple");
			fruits.add("Grapes");
			fruits.add("Mango");
			
			System.out.println("Fruits are: " + fruits);
			
			//Duplicate elements are ignored
			fruits.add("apple");
			
			System.out.println("After adding duplicate elements: " + fruits);
	}

}
