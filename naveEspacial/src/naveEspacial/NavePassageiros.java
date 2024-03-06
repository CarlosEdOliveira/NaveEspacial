package naveEspacial;

public class NavePassageiros extends NaveEspacial {
	private int numeroPassageiros;
	
	public NavePassageiros( String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, int numeroPassageiros, int passageiro)
	{
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.numeroPassageiros = numeroPassageiros;
	}
	
	public void embarcar(int passageiros) {
		System.out.println("Embarcando"+passageiros+"passageiros na nave.");
	}
	
	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	@Override	
	public void acelerar(double velocidade) {
		
		}
	
	@Override
	public void desacelerar(double velocidade) {
		
		}
	
	@Override
	public void abastecer (double litro) {
		
		}

	@Override
	public void viajar (double distancia) {
		
		}

	@Override
	public String toString() {
		return "navesPassageiros [numeroPassageiros=" + numeroPassageiros + "]";
	}
	
	
}