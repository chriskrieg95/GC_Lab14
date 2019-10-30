package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors!");
		String name = Validator.getString(scnr, "Enter your name: ");
		User player1 = new User();
		player1.setName(name);
		
		String cont = "yes";

		while (cont.toLowerCase().startsWith("y")) {
			// your code should start here!
			String response = Validator.getString(scnr, "Would you like to play against TheTigers or TheLions (t/l): ");
			Player player2 = null;
			if (response.equalsIgnoreCase("t")) {
				player2 = new Rocky();
				player2.setName("TheTigers");
			} else if (response.equalsIgnoreCase("l")) {
				player2 = new Randy();
				player2.setName("TheLions");
			} else {
				player2 = Player.chooseOponent(scnr);
			}
			Player.fight(player1, player2);
			
			// your logic should stop here if it doesn't need to be included in the loop
			System.out.println("\nPlay again? (yes/no)");
			cont = scnr.nextLine();
		}

		//This is our indication that the program has ended
		System.out.println("Goodbye!");
		scnr.close();
	}
}
