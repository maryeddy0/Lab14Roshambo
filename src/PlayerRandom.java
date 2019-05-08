import java.util.Random;

public class PlayerRandom extends Player {
	
	private String rock;
	private String paper;
	private String scissor;
	
	
	public PlayerRandom(String rock, String paper, String scissor) {
		super();
		this.rock = rock;
		this.paper = paper;
		this.scissor = scissor;
	}
	
	
	public String getRock() {
		return rock;
	}

	public void setRock(String rock) {
		this.rock = rock;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public String getScissor() {
		return scissor;
	}

	public void setScissor(String scissor) {
		this.scissor = scissor;
	}


	public  Roshambo random() {
		Roshambo[] move = {Roshambo.Rock, Roshambo.Paper, Roshambo.Scissor};
        Random r = new Random();
        int randomNumber = r.nextInt(move.length);
		return move[randomNumber];
		
	}

	@Override
	public void generateRoshambo() {
		Roshambo[] move = {Roshambo.Rock, Roshambo.Paper, Roshambo.Scissor};
        Random r = new Random();
        int randomNumber = r.nextInt(move.length);
        System.out.println(move[randomNumber]);
		return ;
		
	}
	

}
