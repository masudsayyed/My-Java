package calculation;
//importing Scanner
import java.util.Scanner;

public class Calculate {

	//making method
	void all_calci()
	{
		//making object of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number: ");
		//taking variable for user input
		int a = sc.nextInt();
		
		System.out.print("Enter Second number: ");
		//taking variable for user input
		int b = sc.nextInt();
		
		System.out.print("Enter 1 for addition: \n" + "Enter 2 for substraction: \n" + "Enter 3 for multiplication: \n" + "Enter 4 for division: \n");
		//taking variable for user input
		int c = sc.nextInt();
		sc.close();
		
		//assigning operators
		int w = a+b;
		int x = a-b;
		int y = a*b;
		int z = a/b;
		
		//making loop if-else
		if(c == 1)
		{
			System.out.println("Addition of: " + a + " + " + b + " = " +w);
		}
		
		else if(c == 2)
		{
			System.out.println("Subtraction of: " + a + " - " + b + " = " +x);
		}
		
		else if(c == 3)
		{
			System.out.println("Multiplication of: " + a + " X " + b + " = " +y);
		}
		
		else if(c == 4)
		{
			System.out.println("Division of: " + a + " / " + b + " = " +z);
		}
		
	}
}
