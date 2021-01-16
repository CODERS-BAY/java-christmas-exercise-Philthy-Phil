package controller;

import model.Child;
import model.Elf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ElfUtil {

	public ElfUtil() {
		// TODO Auto-generated constructor stub
	}

	// elf age ->
	public int elfSetRandomAge() {
		return (int)(Math.random() * 1000 + 100);
	}

	// elf tier -> novice / apprentice / expert
	public String elfSetRandomTier() {

		String elfTier = "";
		int coinFlip = (int)(Math.random() * 3 + 1);
		switch(coinFlip) {
			case 1 -> elfTier = "Novice";
			case 2 -> elfTier = "Apprentice";
			case 3 -> elfTier = "Expert";
		}
		return elfTier;
	}

	// elf loading sledge
	public boolean elvesLoadSledge(List<Elf> shift, boolean sledgeStatus) {

		int trueLoaders = 0;
		for (Elf elf : shift) {
			if (elf.elfTier.equals("Apprentice") || elf.elfTier.equals("Expert")) {
				trueLoaders++;
			}
		}
		return trueLoaders >= 2 && !sledgeStatus;
	}

	// elf unloading sledge
	public boolean elvesUnloadSledge(List<Elf>shift, boolean sledgeStatus) {

		int trueLoaders = 0;
		for (Elf elf : shift) {
			if (elf.elfTier.equals("Apprentice") || elf.elfTier.equals("Expert")) {
				trueLoaders++;
			}
		}

		return trueLoaders >= 2 && sledgeStatus;
	}

	// elf sorting children by city
	public void elfSortingChildren(List<Child> children) {
		children.sort(Comparator.comparing(Child::getChildCity));
	}

	/*
	 * sledge should be prepared here
	 */
}
