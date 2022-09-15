import java.util.Scanner;
class PrimeNum
{
  void RecogPrime(int i)
 {
  	boolean flag = false;
 	  for (int j = 2; j<=i/2;j++)
 	 {
 	  if (i % 2 == 0)
 	 {
  	  flag=true;
 	break;
 	}
 	}
 	 if (!flag)
 	{	
	 System.out.println(i + " ");
 	}
 }
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Starting Number :" );
int z = sc.nextInt();
System.out.print("Enter last Number :" );
int x = sc.nextInt();
PrimeNum p = new PrimeNum();
System.out.println("Prime number from " + z + " to " + x + " are:");
 for (int a = z; a<=x;a++)
 {
 p.RecogPrime(a);
 }
}
}
