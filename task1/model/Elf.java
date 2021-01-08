package model;

import controller.ElfUtil;

public class Elf extends ElfUtil {

	public String elfName;
	public int elfAge;
	public String elfCity;

	public Elf(String elfName, int elfAge, String elfCity) {

		this.elfName = elfName + "Santa's Henchman";
		this.elfAge = 200;
		this.elfCity = "Snowy White";

	}

	public Elf() {

		this.elfName = "Dullnose Santa's Henchman";
		this.elfAge = 200;
		this.elfCity = "Snowy White";

	}

}
