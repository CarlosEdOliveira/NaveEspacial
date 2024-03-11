package naveEspacial;

public class NaveCarga extends NaveEspacial {
	private double capacidadeCarga;
	
	public NaveCarga( String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, double capacidadeCarga, double carga )
	{
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public void carregar(double carga) {
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
	
	@Override	
	public void acelerar(double velocidade) {
		System.out.println("Aumentando propunção para: " + velocidade + "km/h" );
		}
	
	@Override
	public void desacelerar(double velocidade) {
		System.out.println("Reduzindo propunção para: " + velocidade + "km/h" );
		}
	
	@Override
	public void abastecer (double litro) {
		System.out.println("Abastecendo a nave com: " + litro + "L de combustivel");
		}

	@Override
	public void viajar (double distancia) {
		System.out.println("Viajando :" + distancia + "km");
		}

	@Override
	public String toString() {
		return "NaveCarga [capacidadeCarga=" + capacidadeCarga + ", getCapacidadeCarga()=" + getCapacidadeCarga() + "]";
	}
	
}