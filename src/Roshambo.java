import java.util.Random;

public enum Roshambo {

	 Rock, Paper, Scissor;

	public String toString() {
		switch (this) {
		case Rock:
			return "Rock";
		case Paper:
			return "Paper";
		case Scissor:
			return "Scissor";
		default:
			return "Invalid move";
		}
	

	}
	
	
}
