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

	public static Roshambo random() {
		Roshambo[] move = {Rock, Paper, Scissor};
        Random r = new Random();
        int randomNumber = r.nextInt(move.length);
		return move[randomNumber];
		
	}
	
	
	
	
}
