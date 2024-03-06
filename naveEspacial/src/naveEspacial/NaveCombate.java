package naveEspacial;

public class NaveCombate extends NaveEspacial {
    private String armamento;

    public NaveCombate(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, String armamento) {
        super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
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
    public void acelerar(double velocidade) {
  
    }

    @Override
    public void desacelerar(double velocidade) {

    }

    @Override
    public void abastecer(double litros) {
 
    }

    @Override
    public void viajar(double distancia) {
 
    }

	@Override
	public String toString() {
		return "NaveCombate [armamento=" + armamento + "]";
	}
    
}