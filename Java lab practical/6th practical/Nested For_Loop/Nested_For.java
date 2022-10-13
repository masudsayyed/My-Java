/*
Question - Program to print For loop and print the output as shown in the above fig.
*
**
***
****
*****
******
Name - Masud Sayyed.
Date - 13/10/2022.
*/
package javaversion;

import java.util.Scanner;

public class Nested_For {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=num; i++)
		{
			System.out.println(" ");
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
		}
	}

}