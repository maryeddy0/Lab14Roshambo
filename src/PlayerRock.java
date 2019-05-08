import java.util.Random;

public class PlayerRock extends Player {

	
	
	public PlayerRock() {
		super("The Jets");
	}

	

	@Override
	public String toString() {
		return "TheJets: " + generateRoshambo();
	}



	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.Rock;
	}



}
