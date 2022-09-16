class FruitPer
{
public static void main(String args[])
{
java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.print("enter number of apples remaining: ");
int a = sc.nextInt();
int b = 100;
System.out.print("percentage remaining to sell: ");
int percent = sc.nextInt();
System.out.print("He was having: "+a*b/percent+ " Apples");
}}
