package naveEspacial;

public abstract class NaveEspacial {

	protected String nome;
	protected double velocidadeMaxima;
	protected int numeroTripulantes;
	protected double combustivel;
	
	public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroTripulantes = numeroTripulantes;
		this.combustivel = combustivel;
	}

	public abstract void acelerar(double velocidade);
	
	public abstract void desacelerar(double velocidade);
	
	public abstract void abastecer(double litros);
	
	public abstract void viajar(double distancia);
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}

	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	
	
	@Override
	public String toString() {
		return "naveEspacial [nome=" + nome + ", velocidadeMaxima=" + velocidadeMaxima + ", numeroTripulantes="
				+ numeroTripulantes + ", combustivel=" + combustivel + "]";
	}

}