package model;

public class Presents {

	public String presentName;
	public Child childName;


	public Presents(String presentName, Child childName) {

		this.presentName = presentName;
		this.childName = childName;

	}

	public Presents() {

		this.childName = new Child();
		this.presentName = "Super Christmas Lollipop";

	}

}
