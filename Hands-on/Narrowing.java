/*
  Question - upcasting.
  Name - Masud Sayyed.
  Date - 14/10/2022.
 */
package javaversion;
//importing Scanner class.
import java.util.Scanner;

public class Narrowing {
	
	public static void main(String args[])
	{
		//making Scanner Object.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		//taking input.
		double d = sc.nextDouble();
		sc.close();
	//explicite typing casting required.
	long l = (long)d;
	int i = (int)l;
	
	System.out.println(i);
	System.out.println(l);
	System.out.println(d);
}
}