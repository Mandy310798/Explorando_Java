package DIO.Strategy;

public class ComportamentoDefensivo implements Comportamento {
	
	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}

}
