/*
 In the above example, we have created an interface named Polygon.
 The interface contains an abstract method getArea().
 Here, the Rectangle class implements Polygon. 
 And, provides the implementation of the getArea() method.
 */
package javaversion;

import java.util.Scanner;

class MainPolygon {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int l =sc.nextInt();
		
		System.out.print("Enter breadth: ");
		int b =sc.nextInt();
		 sc.close();
		 
		Rectangle r = new Rectangle();
		r.getArea(l, b);
	}
}