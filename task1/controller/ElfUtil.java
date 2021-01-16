package controller;

import model.Child;
import model.Elf;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ElfUtil {

	private static final String tierT1 = "Novice";
	private static final String tierT2 = "Apprentice";
	private static final String tierT3 = "Expert";
	private static final String tierT4 = "Bloody Noob";

	// elf age ->
	public int elfSetRandomAge() {

		return new Random().nextInt(1001) + 100;

	}

	// elf tier -> novice / apprentice / expert
	public String elfSetRandomTier() {

		String elfTier = "";
		int coinFlip = new Random().nextInt(3) + 1;
		// new java switch expression // java switch statement = case 1 : do-someting; break;
		switch(coinFlip) {
			case 1 -> elfTier = tierT1;
			case 2 -> elfTier = tierT2;
			case 3 -> elfTier = tierT3;
			default -> elfTier = tierT4;
		}
		return elfTier;
	}

	// elf loading sledge
	public boolean elvesLoadSledge(List<Elf> shift, boolean sledgeStatus) {

		int trueLoaders = 0;
		for (Elf elf : shift) {
			if (elf.getElfTier().equals(tierT2) || elf.getElfTier().equals(tierT3)) {
				trueLoaders++;
			}
		}
		return trueLoaders >= 2 && !sledgeStatus;
	}

	// elf unloading sledge
	public boolean elvesUnloadSledge(List<Elf>shift, boolean sledgeStatus) {

		int trueLoaders = 0;
		for (Elf elf : shift) {
			if (elf.getElfTier().equals(tierT2) || elf.getElfTier().equals(tierT3)) {
				trueLoaders++;
			}
		}

		return trueLoaders >= 2 && sledgeStatus;
	}

	// elf sorting children by city
	public void elfSortingChildren(List<Child> children) {
		children.sort(Comparator.comparing(Child::getChildCity));
	}

}
