/*
 Question Encapsulation program
 name - Masud Sayyed
 Date- 7/10/2022
*/
package encapsulation;

class MainCarEncapsulation {
	
	public static void main(String args[])
	{
		
	//generating object of class
	CarEncapsulation ce = new CarEncapsulation();
	
	//calling setters method
	ce.setName("BMW");
	ce.setSeater(7);
	ce.setLocation("Mumbai");
	
	//calling getters method
	System.out.println("Name of car is: " + ce.getName());
	System.out.println("It is: " + ce.getSeater() + " seater.");
	System.out.println("Car is from: " + ce.getLocation());
	}
}
