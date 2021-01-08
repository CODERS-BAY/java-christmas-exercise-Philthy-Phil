package controller;

import model.Elf;
import model.Presents;
import java.util.ArrayList;

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

	// elf sorting presents
	public ArrayList<Presents> elfSortVault(ArrayList<Presents> vault) {

		// TODO sorting method here

		return vault;
	}

	// elf loading sledge
	public boolean elvesLoadSledge(ArrayList<Elf>shift, boolean sledgeStatus) {

		int trueLoaders = 0;
		for (int i = 0; i < shift.size(); i++) {
			if (shift.get(i).elfTier.equals("Apprentice") || shift.get(i).elfTier.equals("Expert")) {
				trueLoaders++;
			}
		}
		if (trueLoaders >= 2 && !sledgeStatus) {
			return true;
		} else {
			return false;
		}
	}

	// elf unloading sledge
	public boolean elvesUnloadSledge(ArrayList<Elf>shift, boolean sledgeStatus) {

		int trueLoaders = 0;
		for (int i = 0; i < shift.size(); i++) {
			if (shift.get(i).elfTier.equals("Apprentice") || shift.get(i).elfTier.equals("Expert")) {
				trueLoaders++;
			}
		}

		if (trueLoaders >= 2 && sledgeStatus) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * sledge should be prepared here
	 */
}
