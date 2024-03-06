package naveEspacial;

public class NaveCarga extends NaveEspacial {
	private double capacidadeCarga;
	
	public NaveCarga( String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, double capacidadeCarga, double carga )
	{
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public void carregar(double carga) {
		System.out.println("Carregando"+carga+"toneladas de carga na nave de carga");
	}
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
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
	
}