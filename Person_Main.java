package corejavabasic;

public class Person_Main {

	public static void main(String args[])
	{
		Address a = new Address("India", "Maharashtra");
		Addressmy b = new Addressmy("mumbai", 45.9, 400012);
		Person p1 = new Person(a, 42, "Manoj");
	    Person p2 = new Person(b, 32, "Vikram", 89);
	    
	    p1.Display();
	    p2.Displaymy();
	}
}
