package controller;

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


	/*
	 * sledge should be prepared here
	 */
}
