/*
Question - Program to demonstrate on nested if. TAke the input from the user.
Name - Masud Sayyed.
Date - 13/10/2022.
*/
package javaversion;

import java.util.Scanner;

public class Nested_If {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your grade: ");
	int per = sc.nextInt();
	
	sc.close();
	
	if(per>=90)
	{
		System.out.println("You got "+ per + " Grade A");
	}
	
	else if(per>=80)
	{
		System.out.println("You got "+ per + " Grade A1");
	}
	
	else if(per>=70)
	{
		System.out.println("You got "+ per + " Grade B");
	}
	
	else if(per>=40)
	{
		System.out.println("You got "+ per + " Grade C");
	}
	
	else
	{
		System.out.println("You got "+ per + " You are Fail.");
	}

}
}