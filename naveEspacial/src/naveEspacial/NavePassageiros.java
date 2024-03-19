package naveEspacial;

public class NavePassageiros extends NaveEspacial {
	private int numeroPassageiros;
	


	public NavePassageiros(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel,
			double velocidade, double distancia, int numeroPassageiros) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel, velocidade, distancia);
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
	public double acelerar() {
		// TODO Auto-generated method stub
		return super.acelerar();
	}

	@Override
	public double desacelerar() {
		// TODO Auto-generated method stub
		return super.desacelerar();
	}

	@Override
	public double abastecer(double litros) {
		// TODO Auto-generated method stub
		return super.abastecer(litros);
	}

	@Override
	public double viajar(double distancia) {
		// TODO Auto-generated method stub
		return super.viajar(distancia);
	}

	@Override
	public String toString() {
		return "NavePassageiros [numeroPassageiros=" + numeroPassageiros + ", nome=" + nome + ", velocidadeMaxima="
				+ velocidadeMaxima + ", numeroTripulantes=" + numeroTripulantes + ", combustivel=" + combustivel
				+ ", velocidade=" + velocidade + ", distancia=" + distancia + "]";
	}

	


}
