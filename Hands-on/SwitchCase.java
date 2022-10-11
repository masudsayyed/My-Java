/*
 Question - Program to demonstrate (Swith) and printing week days.
 Name - Masud Sayyed.
 Date - 11/10/2022.
*/
package javaversion;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 'm','tu','w','th','f'");
		System.out.println("Enter letter of day: ");
		String day = sc.nextLine();
		sc.close();
		
		switch(day.toUpperCase())
		{
		case "M":
		System.out.println("You have selected Monday");
		break;
		
		case "TU":
		System.out.println("You have selected Tuesday");
		break;
		
		case "W":
		System.out.println("You have selected Wednesday");
		break;
		
		case "TH":
		System.out.println("You have selected Thursday");
		break;	
		
		case "F":
		System.out.println("You have selected Friday");
		break;
		
		default:
		System.out.println("You har entered a wrong letter: ");
		}
	}

}
