package naveEspacial;

public class NaveCarga extends NaveEspacial {
	private double capacidadeCarga;
	private double carga;
	
	public NaveCarga(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, double velocidade,
			double distancia, double capacidadeCarga, double carga) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel, velocidade, distancia);
		this.capacidadeCarga = capacidadeCarga;
		this.carga = carga;
	}

	public void carregar() {
		if (carga <= capacidadeCarga) {
			System.out.println("Carga de " + carga + " toneladas realizada com sucesso!");
		} else {
			System.out.println("Capacidade de carga excedida! Carga máxima: " + capacidadeCarga + " toneladas");
		}
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
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
		return "NaveCarga [capacidadeCarga=" + capacidadeCarga + ", carga=" + carga + ", nome=" + nome
				+ ", velocidadeMaxima=" + velocidadeMaxima + ", numeroTripulantes=" + numeroTripulantes
				+ ", combustivel=" + combustivel + ", velocidade=" + velocidade + ", distancia=" + distancia + "]";
	}







 

}