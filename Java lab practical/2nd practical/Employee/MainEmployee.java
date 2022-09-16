import java.util.*;
class MainEmployee
{
public static void main(String args[])
{
Employee e1 = new Employee();
Employee e2 = new Employee();
Employee e3 = new Employee();

Scanner id = new Scanner(System.in);
Scanner name = new Scanner(System.in);
System.out.print("Enter 1st employee id: ");
e1.id = id.nextInt();
System.out.print("Enter 1st employee name: ");
e1.name = name.nextLine();
System.out.print("Enter 2nd employee id: ");
e2.id = id.nextInt();
System.out.print("Enter 2nd employee name: ");
e2.name = name.nextLine();
System.out.print("Enter 3rd employee id: ");
e3.id = id.nextInt();
System.out.print("Enter 3rd employee name: ");
e3.name = name.nextLine();

e1.employeeInfo();
e2.employeeInfo();
e3.employeeInfo();
}}
