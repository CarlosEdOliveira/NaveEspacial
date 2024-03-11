package naveEspacial;

public abstract class NaveEspacial {
	//atributos de nave
	protected String nome;
	protected double velocidadeMaxima;
	protected int numeroTripulantes;
	protected double combustivel;
	protected double aceleracao;
	protected double desaceleracao;
	
	public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroTripulantes = numeroTripulantes;
		this.combustivel = combustivel;
	}
	//métodos de nave
	
	 public void acelerar(double velocidade) {
	        if (velocidade > 0) {
	            if (combustivel >= (velocidade * aceleracao)) {
	                combustivel -= velocidade * aceleracao;
	                velocidadeMaxima += velocidade;
	                System.out.println("Nave acelerada com sucesso!");
	            } else {
	                System.out.println("Combustível insuficiente para acelerar!");
	            }
	        } else {
	            System.out.println("Velocidade inválida!");
	        }
	    }
	
	 public void desacelerar(double velocidade) {
	        if (velocidade > 0) {
	            if (velocidadeMaxima >= velocidade) {
	                velocidadeMaxima -= velocidade;
	                System.out.println("Nave desacelerada com sucesso!");
	            } else {
	                System.out.println("Velocidade a ser diminuida maior que a velocidade atual!");
	            }
	        } else {
	            System.out.println("Velocidade inválida!");
	        }
	    }
	
	public void abastecer(double litros) {
	  combustivel += litros;
      System.out.println("Nave abastecida com " + litros + " unidades de combustivel!");
  }
	public void viajar(double distancia) {
		double velocidadeAtual = 0;
        double tempoViagem = 0;

        while (distancia > 0) {
            if (combustivel >= (velocidadeAtual * aceleracao) * tempoViagem) {
                combustivel -= (velocidadeAtual * aceleracao) * tempoViagem;
                velocidadeAtual += aceleracao * tempoViagem;
                if (velocidadeAtual > velocidadeMaxima) {
                    velocidadeAtual = velocidadeMaxima;
                }
                distancia -= velocidadeAtual * tempoViagem;
            } else {
                tempoViagem = combustivel / ((velocidadeAtual * aceleracao) + (velocidadeMaxima * desaceleracao));
                combustivel = 0;
                distancia -= velocidadeMaxima * tempoViagem;
            }
        }

        System.out.println("Viagem de " + distancia + " unidades concluída com sucesso!");
    }
	
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
		return "NaveEspacial [nome=" + nome + ", velocidadeMaxima=" + velocidadeMaxima + ", numeroTripulantes="
				+ numeroTripulantes + ", combustivel=" + combustivel + ", aceleracao=" + aceleracao + ", desaceleracao="
				+ desaceleracao + ", getNome()=" + getNome() + ", getVelocidadeMaxima()=" + getVelocidadeMaxima()
				+ ", getNumeroTripulantes()=" + getNumeroTripulantes() + ", getCombustivel()=" + getCombustivel() + "]";
	}

	
}
