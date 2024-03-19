package naveEspacial;

public class NaveCombate extends NaveEspacial {
    private String armamento;


	public NaveCombate(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel,
			double velocidade, double distancia, String armamento) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel, velocidade, distancia);
		this.armamento = armamento;
	}

	public void atacar() {
        System.out.println("Atacando com o armamento: " + armamento);
    }
    
    public String getArmamento() {
		return armamento;
	}

	public void setArmamento(String armamento) {
		this.armamento = armamento;
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
		return "NaveCombate [armamento=" + armamento + ", nome=" + nome + ", velocidadeMaxima=" + velocidadeMaxima
				+ ", numeroTripulantes=" + numeroTripulantes + ", combustivel=" + combustivel + ", velocidade="
				+ velocidade + ", distancia=" + distancia + "]";
	}




		


	
    
}