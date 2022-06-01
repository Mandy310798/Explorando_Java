package DIO.Strategy;

public class Robo {
	
	private Comportamento strategy;
	
	public void SetStrategy(Comportamento strategy) {
		this.strategy = strategy; 
	}
	
	public void mover() {
		strategy.mover();
	}
	
}
