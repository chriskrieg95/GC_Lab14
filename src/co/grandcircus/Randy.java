package co.grandcircus;

import java.util.Random;

public class Randy extends Player {

	@Override
	public Roshambo generateRoshambo() {
		Random random = new Random();
		int num = random.nextInt(2);
		if (num == 0) {
			return Roshambo.ROCK;
		} else if (num == 1) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}

}
