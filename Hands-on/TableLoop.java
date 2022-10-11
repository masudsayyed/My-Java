package javaversion;

import java.util.Scanner;

public class TableLoop {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter which table to print: ");
		int num = sc.nextInt();
		sc.close();
		for(int i = 1; i<=10; i++)
		{
			System.out.println(num + " X " + i + " = " + num*i);
		}
	}
}
