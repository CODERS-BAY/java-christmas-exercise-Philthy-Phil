package model;

public class Child {

	private final int childID;
	private final String childName;
	private final int childAge;
	private final String childCity;
	private final String presentsName;

	public Child(int childID, String childName, int childAge, String childCity, String presentsName) {

		this.childID = childID;
		this.childName = childName;
		this.childAge = childAge;
		this.childCity = childCity;
		this.presentsName = presentsName;

	}

	public void printChildAdded() {
		System.out.println("******************************************************************");
		System.out.println("** [system].added to santa's list: 								**");
		System.out.println("******************************************************************");
		System.out.println("** 																**");
		System.out.println("** " + childID + " | " + childName + " | " + childAge + " | " + childCity + " | " + presentsName + " **");
		System.out.println("** 																**");
	}

	public int getChildID() {
		return childID;
	}

	public int getChildAge() {
		return childAge;
	}

	public String getPresentsName() {
		return presentsName;
	}

	public String getChildCity() {
		return childCity;
	}
	public String getChildName() {
		return childName;
	}
}