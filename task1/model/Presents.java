package model;

public class Presents {

	private final String presentsName;
	private final Child child;

	public Presents(String presentsName, Child child) {

		this.presentsName = presentsName;
		this.child = child;

	}

	public String getPresentsName() {
		return presentsName;
	}

	public Child getChild() {
		return child;
	}
}
