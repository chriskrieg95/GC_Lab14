package co.grandcircus;

import java.util.Scanner;

public class User extends Player {

	@Override
	public Roshambo generateRoshambo() {
		Scanner scnr = new Scanner(System.in);
		int move = Validator.getInt(scnr, "Your move? Enter a number. \n1. rock\n2. paper\n3. scissors\n");
		if (move == 1) {
			return Roshambo.ROCK;
		} else if (move == 2) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}
}
