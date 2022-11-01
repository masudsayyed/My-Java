package corejavabasic;

import java.util.*;

class Linked_Hash_Set {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(34);
		obj.add(57);
		obj.add(67);
		
		System.out.println("Arraylist is: " + obj);
		
		//Creating list HashSet from an ArrayList
		LinkedHashSet<Integer> obj1 = new LinkedHashSet<>(obj);
		
		System.out.println("LinkedHashSet is: " + obj1);
	}

}
