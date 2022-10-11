/*
 Question - If your age is greater than 18 than print youn can vote.
 Name - Masud Sayyed.
 Date - 11/10/2022.
*/
package javaversion;

import java.util.Scanner;

public class If_ElseLoop {

	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	sc.close();
	
	if( age <= 18)
	{
	System.out.println("You are not eligable for voting");	
	}
	else
	{
		System.out.println("You are eligable for voting");
	}
	}
}
