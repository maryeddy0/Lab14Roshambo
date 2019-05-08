import java.util.Random;

public class PlayerRock extends Player {
   
	private String dylan;
	   private String rock;
	   
	   
	public PlayerRock(String dylan, String rock) {
		super();
		this.dylan = dylan;
		this.rock = rock;
	}
	
   
	public void setRock(String rock) {
	this.rock = rock;
}
	public String getDylan() {
	return dylan;
}
public void setDylan(String dylan) {
	this.dylan = dylan;
}


	@Override
	public void generateRoshambo() {
		
	}
	@Override
	public String toString() {
		return "PlayerRock [Dylan:" + dylan + ", rock=" + rock + "]";
	}
	

}
