package co.grandcircus;

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
	}

}
