package corejavabasic;

public class Person {

	Address Address;
	Addressmy Addressmy;
	int age;
	String name;
	int id;
	
	public Person(Address Address, int age, String name)
	{
		
		this.Address = Address;
		
		this.age = age;
		this.name = name;
	}
	
	public Person(Addressmy Addressmy, int age, String name, int id)
	{
	
		this.Addressmy = Addressmy;
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	void Display()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(Address);
		
	}
	void Displaymy()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(Addressmy);
		System.out.println(id);
		
	}
	
	
}
