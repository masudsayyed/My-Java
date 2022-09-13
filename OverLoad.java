class OverLoad
{
static void Adress(int p)
{
 System.out.println("pincode is: " + p);
}
static void Adress(int p , String ps)
{
 System.out.println("pincode is: " + p + "   police station is : " + ps );
}
static void Adress(int p , String ps , String a)
{
 System.out.println("pincode is: " + p +  "   police station is : " + ps + "   assembly : " + a);
}
public static void main (String args[])
{
Adress(421505);
Adress(421505,"ambarnath");
Adress(421505,"ambarnath","mumbai");
}
}
