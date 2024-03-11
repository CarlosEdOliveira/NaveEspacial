package naveEspacial;

public class NavePassageiros extends NaveEspacial {
	private int numeroPassageiros;
	
	public NavePassageiros( String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, int numeroPassageiros, int passageiro)
	{
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.numeroPassageiros = numeroPassageiros;
	}
	
    public void embarcar(int passageiros) {
        if (numeroPassageiros + passageiros <= numeroTripulantes) {
            numeroPassageiros += passageiros;
            System.out.println("Embarque de " + passageiros + " passageiros realizado com sucesso!");
        } else {
            System.out.println("Capacidade de passageiros excedida! Número máximo de passageiros: " + numeroTripulantes);
        }
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
		return "NavePassageiros [numeroPassageiros=" + numeroPassageiros + ", getNumeroPassageiros()="
				+ getNumeroPassageiros() + "]";
	}


}
