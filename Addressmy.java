package corejavabasic;

public class Addressmy {
	double roomno;
	int pincode;
	String city;

	public Addressmy(String city, double roomno, int pincode)
	{
		super();
		this.city = city;
		this.roomno = roomno;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Addressmy [roomno=" + roomno + ", pincode=" + pincode + ", city=" + city + "]";
	}
	
}
