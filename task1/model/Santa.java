package model;

public class Santa {

	private final String fName;
	private final String lName;
	private final int age;
	private final String streetName;
	private final int postalCode;
	private final String city;
	private final String country;

	public Santa() {

		this.fName = "Santa";
		this.lName = "Clause";
		this.age = 200;
		this.streetName = "Snow Street White 0";
		this.postalCode = 99999999;
		this.city = "Snowy White";
		this.country = "North Pole";

	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public int getAge() {
		return age;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
}
