import java.util.Random;

public class RandoPlayer extends Player {
	
	public RandoPlayer(String name) {
		super(name);
	}	
	
	@Override
	public Roshambo generateRoshambo() {
		int pick = new Random().nextInt(Roshambo.values().length);
			return Roshambo.values()[pick];
	}	
}
