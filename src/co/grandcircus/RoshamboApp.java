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
				System.out.println("Please enter t or l: ");
			}
			
			String player1Result = player1.generateRoshambo().toString();
			String player2Result = player2.generateRoshambo().toString();
			if (player1Result == player2Result) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), player1Result, player2.getName(), player2Result, "Draw!");
			} else if (player1Result.equalsIgnoreCase("rock") && player2Result.equalsIgnoreCase("scissors")) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), player1Result, player2.getName(), player2Result, player1.getName() + " wins!");
			} else if (player1Result.equalsIgnoreCase("paper") && player2Result.equalsIgnoreCase("rock")) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), player1Result, player2.getName(), player2Result, player1.getName() + " wins!");
			} else if (player1Result.equalsIgnoreCase("scissors") && player2Result.equalsIgnoreCase("paper")) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), player1Result, player2.getName(), player2Result, player1.getName() + " wins!");
			} else if (player1Result.equalsIgnoreCase("rock") && player2Result.equalsIgnoreCase("paper")) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), player1Result, player2.getName(), player2Result, player2.getName() + " wins!");
			} else if (player1Result.equalsIgnoreCase("paper") && player2Result.equalsIgnoreCase("scissors")) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), player1Result, player2.getName(), player2Result, player2.getName() + " wins!");
			} else if (player1Result.equalsIgnoreCase("scissors") && player2Result.equalsIgnoreCase("rock")) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), player1Result, player2.getName(), player2Result, player2.getName() + " wins!");
			}

			// your logic should stop here if it doesn't need to be included in the loop
			System.out.println("\nPlay again? (yes/no)");
			cont = scnr.nextLine();
		}

		//This is our indication that the program has ended
		System.out.println("Goodbye!");
		scnr.close();
	}
}
