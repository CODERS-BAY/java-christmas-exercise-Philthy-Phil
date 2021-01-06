package model;

public class Child {

	public int childID;
	public String childName;
	public int childAge;
	public String childCity;
	public Presents presentsName;

	public Child(int childID, String childName, int childAge, String childCity, Presents presentsName) {

		this.childID = childID;
		this.childName = childName;
		this.childAge = childAge;
		this.childCity = childCity;
		this.presentsName = presentsName;

	}

	public Child() {

		this.childID = 9999;
		this.childName = "Mickey Mouse";
		this.childAge = 90;
		this.childCity = "Disneyland";
		this.presentsName = new Presents();

	}


	public void printChildAdded() {
		System.out.println("** new child added to santa's list: [ID] " + childID + " - [NAME] " + childName + " - [AGE] " + childAge +
							"[presentWish] " + presentsName + "		**");
	}

}
