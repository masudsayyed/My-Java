package numbercode;
//importing Scanner
import java.util.Scanner;

public class LargestNumber {
	
	//making method
	void number()
	{
		//making object of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		//taking variable for user input
		int i = sc.nextInt();
		
		System.out.print("Enter Second number: ");
		//taking variable for user input
		int j = sc.nextInt();
		 sc.close();
		 
		//making loop if-else
		 if(i>j)
		{
			System.out.println(i + " is greater than " + j);
		}
		
		else
		{
			System.out.println(j + " is greater than " + i);
		}
	}

}
