import java.util.ArrayList;
import java.util.Scanner;

public class Lab14App {
	
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> scoreSheet = new ArrayList<>();
		int player1Score = 0;
		int player2Score = 0;
		scoreSheet.add(player1Score);
		scoreSheet.add(player2Score);
		boolean goAgain = true;
		
		Player player1 = createHumanPlayer();
		Player player2 = selectOpponent();
		while (goAgain) {
		Roshambo hand1 = player1.generateRoshambo();
		Roshambo hand2 = player2.generateRoshambo();
		System.out.println(player1.toString() + " played " + hand1);
		System.out.println(player2.toString() + " played " + hand2);
		if (hand1.equals(Roshambo.ROCK) && hand2.equals(Roshambo.ROCK)) {
			System.out.println("Tie Game!");
		}else if (hand1.equals(Roshambo.ROCK) && hand2.equals(Roshambo.PAPER)) {
			System.out.println(player2.toString() + " wins!");
			player2Score = player2Score + 1;
		}else if (hand1.equals(Roshambo.ROCK) && hand2.equals(Roshambo.SCISSORS)) {
			System.out.println(player1.toString() + " wins!");
			player1Score = player1Score + 1;
		}else if (hand1.equals(Roshambo.PAPER) && hand2.equals(Roshambo.PAPER)) {
			System.out.println("Tie Game!");
		}else if (hand1.equals(Roshambo.PAPER) && hand2.equals(Roshambo.ROCK)) {
			System.out.println(player1.toString() + " wins!");
			player1Score = player1Score + 1;
		}else if (hand1.equals(Roshambo.PAPER) && hand2.equals(Roshambo.SCISSORS)) {
			System.out.println(player2.toString() + " wins!");
			player2Score = player2Score + 1;
		}else if (hand1.equals(Roshambo.SCISSORS) && hand2.equals(Roshambo.SCISSORS)) {
			System.out.println("Tie Game!");
		}else if (hand1.equals(Roshambo.SCISSORS) && hand2.equals(Roshambo.PAPER)) {
			System.out.println(player1.toString() + " wins!");
			player1Score = player1Score + 1;
		}else if (hand1.equals(Roshambo.SCISSORS) && hand2.equals(Roshambo.ROCK)) {
			System.out.println(player2.toString() + " wins!");
			player2Score = player2Score + 1;
		}
		System.out.println("Current score:" + "\n" + "Player 1 has: " + player1Score + "\n" + "Player 2 has: " + player2Score);
		System.out.println("Would you like to play again? y/n");
		String userContinue = scnr.nextLine().toLowerCase();
		if (userContinue.startsWith("y")) {
			goAgain = true;
		}else {
			goAgain = false;
		}
		}
		System.out.println("Thanks for playing, goodbye!");
		

	}
	
	private static Player selectOpponent() {
		System.out.println("Would you like to face Albert, Bertha, or Carl?");
		String input = scnr.nextLine().toLowerCase();
		if(input.startsWith("a")) {
			return new RockPlayer("Albert");
		}else if (input.startsWith("b")) {
			return new PaperPlayer("Bertha");
		}else {
			return new RandoPlayer("Carl");
		}
	}
	
	private static HumanPlayer createHumanPlayer() {
		System.out.println("What's your name?");
		String name = scnr.nextLine();
		return new HumanPlayer(name, scnr);
	}

}
