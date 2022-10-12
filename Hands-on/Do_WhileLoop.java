/*
 Question - Program to Demonstrate do-while and print reverse counting.
 Name - Masud Sayyed.
 Date - 12/10/2022. 
*/
package javaversion;

import java.util.Scanner;

public class Do_WhileLoop {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i = num; i>=1; i--)
		{
		do
		{
			System.out.println(i);
			break;
		}
		
		//Test condition.
		while(num >= 0);
		
}
}
}