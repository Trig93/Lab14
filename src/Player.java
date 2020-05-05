
public abstract class Player {
	
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}
	
	public String toString() {
		
		return name;
		
	}

}

