  /*
  Question - Array String Reverse.
  Name - Masud Sayyed.
  Date - 21/10/2022.
 */
package javaversion;

public class ArrayRev {
	public static void main(String ... args)
	{
		  java.util.Scanner sc = new java.util.Scanner(System.in);
		  System.out.print("Enter a String : ");
		  String a = sc.nextLine();
		  char[] b= a.toCharArray();
		  System.out.print("{");
		  for(int i=b.length-1;i>=0;i--)
		  {
		   System.out.print(b[i]+",");
		  }
		  System.out.println("}");
		 }

}
