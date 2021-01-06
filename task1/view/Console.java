package view;

import java.util.Scanner;

public class Console {
	/*
	 * the console dialog comes here
	 */
	public Scanner scanBot = new Scanner(System.in);

	// display login screen
	public void dialogLoginScreen() {

		System.out.println("##########################################################");
		System.out.println("##     Welcome to the Login-Screen of Santa's App!      ##");
		System.out.println("##########################################################");
		System.out.println();
		System.out.println("**********************************************************");
		System.out.println("** Please login to proceed to your home-screen:			**");
		System.out.println("**********************************************************");
		System.out.println("** [1].Santa											**");
		System.out.println("** [2].Elf												**");
		System.out.println("** [3].Child											**");
		System.out.println("**********************************************************");

		String input = scanBot.nextLine();
		switch (input) {
			case "1" -> dialogSanta();	// login as Santa
			case "2" -> dialogElf(); 	// login as Elf
			case "3" -> dialogChild();	// login as Child
			default -> {
				System.out.println("input is incorrect! please try again!");
				System.out.println("**********************************************************");
				dialogLoginScreen();
			}
		}

	}

	// display santa home-screen
	public void dialogSanta() {
		String usr = "santa";
		System.out.println();
		System.out.println("**********************************************************");
		System.out.println("** HoHoHo Santa! what would you like to do?				**");
		System.out.println("**********************************************************");
		System.out.println("** [1].list all presents								**");
		System.out.println("** [2].list all children & their wishes					**");
		System.out.println("** [3].check sledge-load-status							**");
		System.out.println("** [x].logout / back to Login-Screen.					**");
		System.out.println("**********************************************************");

		String input = scanBot.nextLine();
		switch (input) {
			case "1" -> {
				System.out.println("List all presents here");
				backToHome(usr);
			}
			case "2" -> {
				System.out.println("List all children & their wishes here");
				backToHome(usr);
			}
			case "3" -> {
				System.out.println("check sledge-load-status");
				backToHome(usr);
			}
			case "x" -> {
				dialogLoginScreen();
			}
			default -> {
				System.out.println("input is incorrect! please try again!");
				System.out.println("**********************************************************");
				dialogSanta();
			}
		}
	}

	// display elf home-screen
	public void dialogElf() {
		String usr = "elf";
		System.out.println();
		System.out.println("**********************************************************");
		System.out.println("** HoHoHo my little elf! what would you like to do?		**");
		System.out.println("**********************************************************");
		System.out.println("** [1].some fancy stuff									**");
		System.out.println("** [2].some really fancy stuff							**");
		System.out.println("** [3].active sledge-load								**");
		System.out.println("** [x].logout / back to Login-Screen.					**");
		System.out.println("**********************************************************");

		String input = scanBot.nextLine();
		switch (input) {
			case "1" -> {
				System.out.println("some fancy stuff");
				backToHome(usr);
			}
			case "2" -> {
				System.out.println("some really fancy stuff");
				backToHome(usr);
			}
			case "3" -> {
				System.out.println("active sledge-load");
				backToHome(usr);
			}
			case "x" -> {
				dialogLoginScreen();
			}
			default -> {
				System.out.println("input is incorrect! please try again!");
				System.out.println("**********************************************************");
				dialogElf();
			}
		}
	}

	// display child home-screen
	public void dialogChild() {
		String usr = "child";
		System.out.println();
		System.out.println("**********************************************************");
		System.out.println("** Hello my dear! What do you want to do?				**");
		System.out.println("**********************************************************");
		System.out.println("** [1].name?											**");
		System.out.println("** [2].adress?											**");
		System.out.println("** [x].logout / back to Login-Screen.					**");
		System.out.println("**********************************************************");

		String input = scanBot.nextLine().toLowerCase();
		switch (input) {
			case "1" -> {
				System.out.println("name?");
				backToHome(usr);
			}
			case "2" -> {
				System.out.println("adress?");
				backToHome(usr);
			}
			case "x" -> {
				dialogLoginScreen();
			}
			default -> {
				System.out.println("input is incorrect! please try again!");
				System.out.println("**********************************************************");
				dialogChild();
			}
		}

	}


	public void backToHome(String usr) {
		System.out.println("** [x].back to Home-Screen								**");
		System.out.println("**********************************************************");
		String input = scanBot.nextLine().toLowerCase();
		if(input.equals("x")) {
			switch (usr) {
				case "santa" -> dialogSanta();
				case "elf" -> dialogElf();
				case "child" -> dialogChild();
			}
		} else {
			System.out.println("** input is incorrect! please try again!				**");
			System.out.println("**********************************************************");
			backToHome(usr);
		}
	}

}
