package naveEspacial;

public abstract class NaveEspacial {
	
	//atributos de nave
	
	protected String nome;
	protected double velocidadeMaxima;
	protected int numeroTripulantes;
	protected double combustivel;
	protected double velocidade;
	protected double distancia;
	
	
	
	public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, double velocidade, double distancia) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroTripulantes = numeroTripulantes;
		this.combustivel = combustivel;
		this.velocidade = velocidade;
		this.distancia = distancia;
	}
	//métodos de nave
	
	public double acelerar() {
		return this.velocidade++;
	}
	

	
	public double desacelerar() {
		return this.velocidade--;
	}

	
	public double abastecer(double litros) {
		return this.combustivel = this.combustivel + litros;
	}
	

	
	public double viajar(double distancia) {
		return this.combustivel = this.combustivel - distancia * 0.5;		
	}	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
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
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		return "NaveEspacial [nome=" + nome + ", velocidadeMaxima=" + velocidadeMaxima + ", numeroTripulantes="
				+ numeroTripulantes + ", combustivel=" + combustivel + ", velocidade=" + velocidade + ", distancia="
				+ distancia + "]";
	}


	
}
