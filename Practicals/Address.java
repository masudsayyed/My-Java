package corejavabasic;

public class Address {

	String country;
	
	String state;
	

	
	public Address(String country, String state)
	{
		super();
		this.country = country;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + "]";
	}
	
	
	
	
}
