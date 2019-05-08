
public class PlayerUser extends Player {
	
	private String move;

	public PlayerUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return getName() + ": ";
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}

}
