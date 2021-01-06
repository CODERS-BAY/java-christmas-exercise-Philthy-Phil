package model;

public class Child {

	public String childName;
	public int childAge;
	public String childCity;
	public Presents presentsName;

	public Child(String childName, int childAge, String childCity, Presents presentsName) {

		this.childName = childName;
		this.childAge = childAge;
		this.childCity = childCity;
		this.presentsName = presentsName;

	}

	public Child() {

		this.childName = "Mickey Mouse";
		this.childAge = 90;
		this.childCity = "Disneyland";
		this.presentsName = new Presents();

	}
}
