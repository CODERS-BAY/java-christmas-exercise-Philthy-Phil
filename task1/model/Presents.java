package model;

public class Presents {

	public String presentsName;
	public Child childName;


	public Presents(String presentsName, Child childName) {

		this.presentsName = presentsName;
		this.childName = childName;

	}

	public Presents() {

		this.childName = new Child();
		this.presentsName = "Super Christmas Lollipop";

	}

}
