package MyPackage;

public class ContactPerson {
	String first_name;
	String last_name;
	String address;
	String city;
	int phone;
	int zip;
	String email;
	
	public ContactPerson() {
		
	}
	
	public ContactPerson(String first_name, String last_name, String address, String city, int phone, int zip,
			String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.zip = zip;
		this.email = email;
	}
	
	
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return first_name + " " + last_name + " " + email;
	}
	
	
}
