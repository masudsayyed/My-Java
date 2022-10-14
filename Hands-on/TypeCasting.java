/*
  Question - downcasting.
  Name - Masud Sayyed.
  Date - 14/10/2022.
 */
package javaversion;
//importing Scanner class.
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		//making Scanner Object.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		//taking input.
		int i = sc.nextInt();
		sc.close();
		//Down casting
		long l = i;
		float f = l; 
		//printing statement.
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
			
			
	}

}