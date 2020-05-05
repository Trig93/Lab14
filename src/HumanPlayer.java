
import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private Scanner scnr;

	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		String answer = ValidatorMethods.getStringMatchingRegex(scnr, "Rock, paper, or scissors? (r/p/s): ", "[r]||[p]||[s]");
		if (answer.startsWith("r")) {
			return Roshambo.ROCK;
		} else if (answer.startsWith("p")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}
	
	
	

}
