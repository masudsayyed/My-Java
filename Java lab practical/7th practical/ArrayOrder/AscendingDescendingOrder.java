package javaversion;

import java.util.*;


public class AscendingDescendingOrder {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int a = sc.nextInt();
		Integer array[]=new Integer[a];
		sc.close();
		System.out.println("Enter elements ");
		
		for(int i=0;i<a;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Descending array is" + Arrays.toString(array));
		
		for(int i=0;i>a;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Descending array is" + Arrays.toString(array));
	}
}
