import java.util.Random;

public class PlayerRandom extends Player {
	
	public PlayerRandom() {
		super("The Jets");
	}
	
	@Override
	public String toString() {
		return "TheSharks: " + generateRoshambo();
	}

	@Override
	public Roshambo generateRoshambo() {
		Roshambo[] move = {Roshambo.Rock, Roshambo.Paper, Roshambo.Scissor};
        Random r = new Random();
        int randomNumber = r.nextInt(move.length);
		return move[randomNumber];
		
	
	}

}
