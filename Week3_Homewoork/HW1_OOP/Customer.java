package hw1_oop;

public class Customer {
	private int id;
	//private String firstName;
	//												   >> Bu özellikleri IndividualCustomer sınıfına taşıdık.
	//private String lastName;				
	private String city;
	public Customer() {
		
	}
	public Customer(int id,String city) {
		
		this.id = id;
		//this.firstName = firstName;
		//this.lastName = lastName;						>> Bu özellikleri IndividualCustomer sınıfına taşıdık.
		//this.nationalIdentity = nationalIdentity;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}*/
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
