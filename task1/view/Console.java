package view;

import model.Child;
import model.Presents;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Console {
	/*
	 * the console dialog comes here
	 */
	public Scanner scanBot = new Scanner(System.in);
	public int ID = 1;
	public boolean sledgeStatus = false;

	ArrayList<Child> children = new ArrayList<>();
	ArrayList<Presents> vault = new ArrayList<>();

	// display login screen
	public void dialogLoginScreen() {

		System.out.println("##################################################################");
		System.out.println("##          Welcome to the Login-Screen of Santa's App!         ##");
		System.out.println("##################################################################");
		System.out.println();
		System.out.println("******************************************************************");
		System.out.println("** [system].Please login to proceed to your home-screen:		**");
		System.out.println("******************************************************************");
		System.out.println("** [1].Santa													**");
		System.out.println("** [2].Elf														**");
		System.out.println("** [3].Child													**");
		System.out.println("******************************************************************");

		String input = scanBot.nextLine();
		switch (input) {
			case "1" -> dialogSanta();	// login as Santa
			case "2" -> dialogElf(); 	// login as Elf
			case "3" -> dialogChild();	// login as Child
			default -> {
				System.out.println("** [system].input is incorrect! please try again!				**");
				System.out.println("******************************************************************");
				dialogLoginScreen();
			}
		}

	}

	// display santa home-screen
	public void dialogSanta() {
		String usr = "santa";
		System.out.println("******************************************************************");
		System.out.println("** [system].HoHoHo Santa! what would you like to do?			**");
		System.out.println("******************************************************************");
		System.out.println("** [1].list all presents stored in xmas-vault.					**");
		System.out.println("** [2].list all children & their wishes.						**");
		System.out.println("** [3].check sledge-load-status.								**");
		System.out.println("** [x].logout / back to Login-Screen.							**");
		System.out.println("******************************************************************");

		String input = scanBot.nextLine();
		switch (input) {
			case "1" -> {
				dialogShowSantaVaultItems();
				backToHome(usr);
			}
			case "2" -> {
				dialogShowSantaVaultItemsInclusiveInfos();
				backToHome(usr);
			}
			case "3" -> {
				dialogShowSantaSledgeStatus();
				backToHome(usr);
			}
			case "x" -> {
				dialogLoginScreen();
			}
			default -> {
				System.out.println("** [system].input is incorrect! please try again!				**");
				System.out.println("******************************************************************");
				dialogSanta();
			}
		}
	}

	// display elf home-screen
	public void dialogElf() {
		String usr = "elf";
		System.out.println("******************************************************************");
		System.out.println("** [system].HoHoHo my little elf! what would you like to do? 	**");
		System.out.println("******************************************************************");
		System.out.println("** [1].some fancy stuff.										**");
		System.out.println("** [2].some really fancy stuff.									**");
		System.out.println("** [3].active sledge-load.										**");
		System.out.println("** [x].logout / back to Login-Screen.							**");
		System.out.println("******************************************************************");

		String input = scanBot.nextLine();
		switch (input) {
			case "1" -> {
				System.out.println("some fancy stuff.");
				backToHome(usr);
			}
			case "2" -> {
				System.out.println("some really fancy stuff.");
				backToHome(usr);
			}
			case "3" -> {
				System.out.println("active sledge-load.");
				backToHome(usr);
			}
			case "x" -> {
				dialogLoginScreen();
			}
			default -> {
				System.out.println("** [system].input is incorrect! please try again!				**");
				System.out.println("******************************************************************");
				dialogElf();
			}
		}
	}

	// display child home-screen
	public void dialogChild() {
		String usr = "child";
		System.out.println("******************************************************************");
		System.out.println("** [system].Hello my dear! What do you want to do?				**");
		System.out.println("******************************************************************");
		System.out.println("** [1].register in santa's list as a new child?					**");
//		System.out.println("** [2].change your details in santa's list?	(ID needed) 		**");
		System.out.println("** [x].logout / back to Login-Screen.							**");
		System.out.println("******************************************************************");

		String input = scanBot.nextLine().toLowerCase();
		switch (input) {
			case "1" -> {
				System.out.println("** [system].ok let's get some things done.						**");
				System.out.println("******************************************************************");
				dialogRegisterChild();
				backToHome(usr);
			}
//			case "2" -> {
//				System.out.println("** [update] ok let's search your ID?							**");
//				System.out.println("******************************************************************");
//				backToHome(usr);
//			}
			case "x" -> {
				dialogLoginScreen();
			}
			default -> {
				System.out.println("** [system].input is incorrect! please try again!				**");
				System.out.println("******************************************************************");
				dialogChild();
			}
		}

	}

	// dialog show all children inclusive their infos in vault
	public void dialogShowSantaVaultItemsInclusiveInfos() {
		String usr = "santa";
		System.out.println("******************************************************************");
		System.out.println("** [system].vault loading! here are all stored infos so far!	**");

		if (children.size() == 0) {
			System.out.println("**  															**");
			System.out.println("** [system].looks like the vault is still empty! return later!	**");
		} else {
			System.out.println("** [system].[ID] | [Name] | [Age] | [City] | [Present]  **");
			System.out.println("**  															**");
			for (int i = 0; i < children.size(); i++) {
				System.out.println("** " + children.get(i).childID + " | " + children.get(i).childName + " | " +
						children.get(i).childAge + " | " + children.get(i).childCity + " | " + children.get(i).presentsName + " **");
			}
		}
		System.out.println("**  															**");
	}

	// dialog show all presents in vault
	public void dialogShowSantaVaultItems() {
		String usr = "santa";
		System.out.println("******************************************************************");
		System.out.println("** [system].vault loading! here are all stored presents so far!	**");

		if (children.size() == 0) {
			System.out.println("**  															**");
			System.out.println("** [system].looks like the vault is still empty! return later!	**");
		} else {
			System.out.println("** [system]. listed [presentName] 								**");
			System.out.println("**  															**");
			for (int i = 0; i < children.size(); i++) {
				System.out.println("** [slot] presentsName = " + children.get(i).presentsName + "  **");
			}
		}
		System.out.println("**  															**");
	}

	// dialog check sledge-status
	public void dialogShowSantaSledgeStatus() {
		System.out.println("******************************************************************");
		System.out.println("** [system].sledge-status loading! 								**");
		System.out.println("**  															**");
		if (!sledgeStatus) {
			System.out.println("** [system].looks like the sledge isn't still loaded yet! 		**");
			System.out.println("** [system].kick some elves asses! and come back later!			**");
		} else {
			System.out.println("** [system].HoHoHo santa!										**");
			System.out.println("** [system].sledge is loaded and ready for take off!			**");
			System.out.println("** [system].Merry fucking Christmas! 							**");
		}
		System.out.println("**  															**");
	}

	//dialog register new child
	public void dialogRegisterChild() {
		String usr = "child";
		int inputChildID = ID++;
		System.out.println("** [register].what's your name? [e.g. 'Donald Duck']			**");
		String inputChildName = scanBot.nextLine();

		System.out.println("** [register].what's your age? [e.g. '11']						**");
		int inputChildAge = scanBot.nextInt();
		scanBot.nextLine();

		//TO-DO catch wrong verification types

		System.out.println("** [register].what's your city name? 	[e.g. 'Vienna']			**");
		String inputChildCity = scanBot.nextLine();

		System.out.println("** [register].what's your presentWish? [e.g. 'lollipop']		**");
		String inputPresentsName = scanBot.nextLine();

		System.out.println("** [register].great job! santa now knows about you & your wish.	**");

		Child child = new Child(inputChildID, inputChildName, inputChildAge, inputChildCity, inputPresentsName);
		Presents present = new Presents(inputPresentsName, child);
		child.printChildAdded();

		children.add(child);
		vault.add(present);

		System.out.println("******************************************************************");
		System.out.println("** [system].add another child? [y].for yes [x].stop adding		**");
		String inputOneMore = scanBot.nextLine().toLowerCase();

		if (inputOneMore.equals("y")) {
			System.out.println("** [system].ok let's get some things done first.				**");
			System.out.println("******************************************************************");
			dialogRegisterChild();
			backToHome(usr);
		}
		else if (inputOneMore.equals("x")) {
			backToHome(usr);
		}


	}

	// back to home-screen
	public void backToHome(String usr) {
		System.out.println("** [x].back to Home-Screen.										**");
		System.out.println("******************************************************************");
		String input = scanBot.nextLine().toLowerCase();
		if(input.equals("x")) {
			switch (usr) {
				case "santa" -> dialogSanta();
				case "elf" -> dialogElf();
				case "child" -> dialogChild();
			}
		} else {
			System.out.println("** input is incorrect! please try again!						**");
			System.out.println("******************************************************************");
			backToHome(usr);
		}
	}

}
