package encapsulation;

class MainEncapsulation {

	public static void main(String[] args) {
 
		Encapsulation e =new Encapsulation();
		
		//calling setter method using object of class.
		e.setId(101);
		e.setName("Vikram");
		e.setAge(20);

		//calling getter method using object of class.
		System.out.println("id is: " + e.getId());
		System.out.println("name is: " + e.getName());
		System.out.println("age is: " + e.getAge());
	}

}
