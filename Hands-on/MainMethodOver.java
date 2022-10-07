package myproject;

import java.util.Scanner;

public class MainMethodOver {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int i = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int j = sc.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int k = sc.nextInt();
		
		System.out.print("Enter 4th number: ");
		int l = sc.nextInt();
		sc.close();
		
		MethodOver mo1 = new MethodOver();
		mo1.add(i, j);
		
		MethodOver mo2 = new MethodOver();
		mo2.add(i, j, k);
		
		MethodOver mo3 = new MethodOver();
		mo3.add(i, j, k, l);
	}

}
