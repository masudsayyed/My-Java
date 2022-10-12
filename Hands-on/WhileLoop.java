/*
 Question - Program to Demonstrate while loop continues until 
 entered number is positive.
 Name - Masud Sayyed.
 Date - 12/10/2022. 
*/
package javaversion;

import java.util.Scanner;

class WhileLoop {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();;
		//Test condition.
		while(num >= 1 )
		{
			//System.out.println("Welcome to the java world.");
			System.out.println("Enter a another Number: ");
		    num = sc.nextInt();
		}
		sc.close();
	}
}
