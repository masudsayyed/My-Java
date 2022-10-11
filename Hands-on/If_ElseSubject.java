package javaversion;

import java.util.Scanner;

public class If_ElseSubject {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter total marks of all subject: ");
		double mark = sc.nextInt();
		sc.close();
		
		double totalmark = 500;
		
		double percentage = mark/totalmark*100;
		
	
		
		if(mark < 300)
		{
			System.out.println("You are fail.");
		}
		else
		{
			System.out.println("Congrates "+ name + " you are pass.");	
			System.out.println("You got: " +  percentage + "%");
		}
	}
}
