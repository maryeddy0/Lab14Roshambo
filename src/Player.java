
public abstract class Player {

	private String name;
	
	public abstract void generateRoshambo();

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player name:" + name;
	}

	
}
