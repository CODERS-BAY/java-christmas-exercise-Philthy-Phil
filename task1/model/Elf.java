package model;

public class Elf {

	public String fName;
	public String lName;
	public int age;
	public String streetName;
	public int postalCode;
	public String city;
	public String country;

	public Elf(String fName) {

		this.fName = fName;
		this.lName = "Santa's Henchman";
		this.age = 200;
		this.streetName = "Snow Street White 0";
		this.postalCode = 99999999;
		this.city = "Snowy White";
		this.country = "Northpole";

	}

	public Elf() {

		this.fName = "Dullnose";
		this.lName = "Santa's Henchman";
		this.age = 200;
		this.streetName = "Snow Street White 0";
		this.postalCode = 99999999;
		this.city = "Snowy White";
		this.country = "Northpole";

	}

}
