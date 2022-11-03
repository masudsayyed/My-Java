/* Write a java program to change PriorityQueue to maximum Priorityqueue Using Any loop
 * Name : Masud Sayyed
 * Date : 03-11-22
 */

package javacode;

import java.util.*;

public class Question_5 {

	public static void main(String[] args) {
		
		// Creating an object of PriorityQueue class
				PriorityQueue<Integer> num = new PriorityQueue<>(Collections.reverseOrder());
				   // Add numbers in the Queue
				   num.add(52);
				   num.add(24);
				   num.add(69);
				   num.add(89);
				   num.add(45);
				   num.add(44);
				   num.add(63);
				   num.add(12);
				   num.add(80);
				
					//Printing Original priority queue
				   System.out.println("Original Priority Queue: "+num);
				   
				   //Printing Maximum priority Queue
				System.out.print("Maximum Priority Queue with Addition: ");
				Integer val = 100;
				//using do_while loop
				
				do
				{
				    System.out.print(val+"  ");
			      }
				while( ( val = num.poll()) != null);
	}

}
