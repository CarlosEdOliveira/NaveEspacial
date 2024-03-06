package naveEspacial;

public class Nave {
    public static void main(String[] args) {

        System.out.println("Criando nave:");
        
        String nome = Teclado.lerString("Informe o nome da nave:");

        double velocidadeMaxima = Teclado.lerDouble("Informe a velocidade máxima da nave:");
        
        int numeroTripulantes = Teclado.lerInteiro("Informe o número de tripulantes da nave:");
        
        double combustivel = Teclado.lerDouble("Informe a quantidade de combustível na nave:");
        
        int tipoNave = 0;
        
        do {
        	
            System.out.println("\nQual o tipo de nave você deseja criar? \n 1 - Nave de Carga, \n 2 - Nave de Passageiros, \n 3 - Nave de Combate, \n 0 - Encerrar lançamento");
        	
        	tipoNave = Teclado.lerInteiro("");
        	
        	switch (tipoNave) {
			case 1:
				
	            double capacidadeCarga = Teclado.lerDouble("Informe a capacidade de carga da nave:");
	            //NaveCarga naveCarga = new NaveCarga(nome, velocidadeMaxima, numeroTripulantes, combustivel, capacidadeCarga);
	            System.out.println("Essa nave esta carregada com; "+capacidadeCarga+" toneladas");
	            // Interagir com a nave de carga
				break;
			case 2:
	           int numeroPassageiros = Teclado.lerInteiro("Informe o número de passageiros na nave:");
	           //NavePassageiros navePassageiros = new NavePassageiros(nome, velocidadeMaxima, numeroTripulantes, combustivel, numeroPassageiros);
	           System.out.println("Essa nave agora viaja com: "+numeroPassageiros+" passageiros.");
	            // Interagir com a nave de passageiros
				break;
			case 3:
	            String armamento = Teclado.lerString("Informe o armamento da nave:");
	            //NaveCombate naveCombate = new NaveCombate(nome, velocidadeMaxima, numeroTripulantes, combustivel, armamento);
	            System.out.println("Essa nave agora pode atacar usando: "+armamento);
	            // Interagir com a nave de combate
				break;
			case 0:
			System.out.println("Desligando a nave...");
				break;
			default:
	            System.out.println("Tipo de nave inválido.");
        	}
        } while (tipoNave != 0);
        
    }
}