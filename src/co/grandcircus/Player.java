package co.grandcircus;

import java.util.Scanner;

public abstract class Player {
	private String name;
	
	public abstract Roshambo generateRoshambo();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void fight(Player player1, Player player2) {
		Roshambo p1rs = player1.generateRoshambo();
		Roshambo p2rs = player2.generateRoshambo();
		if (p1rs == p2rs) {
			System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), p1rs.toString(), player2.getName(), p2rs.toString(), "Draw!");
		} else if (p1rs == Roshambo.ROCK) {
			if(p2rs == Roshambo.PAPER) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), p1rs.toString(), player2.getName(), p2rs.toString(), player2.getName() + " wins!");
			}  else {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), p1rs.toString(), player2.getName(), p2rs.toString(), player1.getName() + " wins!");
			} 
		} else if (p1rs == Roshambo.PAPER) {
			if (p2rs == Roshambo.ROCK) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), p1rs.toString(), player2.getName(), p2rs.toString(), player1.getName() + " wins!");
			} else {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), p1rs.toString(), player2.getName(), p2rs.toString(), player2.getName() + " wins!");
			} 
		} else if (p1rs == Roshambo.SCISSORS) {
			if (p2rs == Roshambo.ROCK) {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), p1rs.toString(), player2.getName(), p2rs.toString(), player2.getName() + " wins!");
			} else {
				System.out.printf("\n%s: %s \n%s: %s \n%s\n", player1.getName(), p1rs.toString(), player2.getName(), p2rs.toString(), player1.getName() + " wins!");
			}
		}
	}
	
	public static Player chooseOponent(Scanner scnr) {
		Player player2 = null;
		String response = "";
		boolean isValid = false;
		do {
			response = Validator.getString(scnr, "Would you like to play against TheTigers or TheLions (t/l): ");
			if (response.equalsIgnoreCase("t")) {
				isValid = true;
				player2 = new Rocky();
				player2.setName("TheTigers");
			} else if (response.equalsIgnoreCase("l")) {
				isValid = true;
				player2 = new Randy();
				player2.setName("TheLions");
			} 
		} while(!isValid);
		return player2;
	}

}
