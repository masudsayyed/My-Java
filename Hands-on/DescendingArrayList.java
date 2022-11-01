/*
 write to sort ArrayList in Descending order.
 Name : Masud Sayyed.
*/
package corejavabasic;

import java.util.*;

class DescendingArrayList {

	public static void main(String ... args)
	{
		ArrayList<Integer> Des = new ArrayList<>();
		Des.add(45);
		Des.add(65);
		Des.add(23);
		Des.add(32);
		Des.add(56);
		Des.add(54);
		
		System.out.println("ArrayList: " + Des);
		
		Collections.sort(Des, Collections.reverseOrder());
		System.out.print("Desending ArrayList: (");
		
		Iterator<Integer> FDes = Des.iterator();
		while(FDes.hasNext())
		{
			System.out.print(FDes.next());
			System.out.print(",");
		}
		System.out.println(")");
	}
}