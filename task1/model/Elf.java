package model;

import controller.ElfUtil;

public class Elf extends ElfUtil {

	private final int elfID;
	private final String elfName;
	private final String elfTier;
	private final int elfAge;
	private final String elfCity;

	public Elf(int elfID, String elfName) {

		this.elfID = elfID;
		this.elfName = elfName + " Santa's Henchman";
		this.elfTier = super.elfSetRandomTier();
		this.elfAge = super.elfSetRandomAge();
		this.elfCity = "Snowy White";

	}

	public void printElfAdded() {
		System.out.println("******************************************************************");
		System.out.println("** [system].stamped in to today's shift:						**");
		System.out.println("******************************************************************");
		System.out.println("** 																**");
		System.out.println("** " + elfID + " | " + elfName + " | " + elfTier + " | " + elfAge + " | " + elfCity + " **");
		System.out.println("** 																**");
	}

	public int getElfID() {
		return elfID;
	}

	public String getElfName() {
		return elfName;
	}

	public String getElfTier() {
		return elfTier;
	}

	public int getElfAge() {
		return elfAge;
	}

	public String getElfCity() {
		return elfCity;
	}
}
