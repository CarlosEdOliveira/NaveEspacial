package naveEspacial;

public class Nave {

	public static void main(String[] args) {
    	
    	
    	Nave nave = new Nave();
		
	    String nome = Teclado.lerString("Informe o nome da nave: ");
	    double velocidadeMaxima = Teclado.lerDouble("Informe a velocidade máxima da nave:");
	    int numeroTripulantes = Teclado.lerInteiro("Informe o número de tripulantes da nave:");
	    double combustivel = Teclado.lerDouble("Informe a capacidade máxima de combustível na nave:");
	    double velocidade = Teclado.lerDouble("Informe a velocidade da nave: ");
	    double distancia = Teclado.lerDouble("Informe a distancia que deseja percorrer: ");
    	
        System.out.println("Criando nave:");

        
        int tipoNave = 0;
        
        do {
        	
            System.out.println("\nQual o tipo de nave você deseja criar? \n 1 - Nave de Carga, \n 2 - Nave de Passageiros, \n 3 - Nave de Combate, \n 4 - Determinar ação, \n 0 - Encerrar lançamento");
        	
        	tipoNave = Teclado.lerInteiro("");
        	
        	//System.out.println("Pilotar: \n 4 - Acelerar, \n 5 - Desacelerar, \n 6 - Abastecer, \n 7 - Viajar");
        	
        	//tipoNave = Teclado.lerInteiro("");
        	switch (tipoNave) {
			case 1:
	            // Interagir com a nave de carga
	            double capacidadeCarga = Teclado.lerDouble("Informe a capacidade de carga da nave:");
	            double carga = Teclado.lerDouble("Informe a quantidade de carga a transportar:");
	            
				//geral
	            NaveCarga naveCarga = new NaveCarga(nome, velocidadeMaxima, numeroTripulantes,  combustivel, velocidade, distancia, capacidadeCarga, carga);
				//setNave  

				naveCarga.setNome(nome);
				naveCarga.setVelocidadeMaxima(velocidadeMaxima);
				naveCarga.setVelocidade(velocidade);
				naveCarga.setCombustivel(combustivel);
				naveCarga.setDistancia(distancia);
				naveCarga.setNumeroTripulantes(numeroTripulantes);
				naveCarga.setCapacidadeCarga(capacidadeCarga);
				naveCarga.setCarga(carga);
				
	           System.out.println(naveCarga.toString());
	            
	            naveCarga.acelerar();
	            naveCarga.desacelerar();
	            naveCarga.abastecer(combustivel);

	            System.out.println(naveCarga.toString());
	            while(true) {
	            	System.out.println("deseja viajar ?");
	            	int opcao = Teclado.lerInteiro("1.sim \n 2-não");
	            			if(opcao == 1) {
	            				naveCarga.viajar(distancia);
	            				break;
	            				} else {
	            					System.out.println("ok, até a próxima");
	            					System.exit(0);
	            					break;
	            			}
	            }
				break;
			case 2:
	            // Interagir com a nave de passageiros
		         int numeroPassageiros = Teclado.lerInteiro("Informe o número de passageiros na nave:");
				
				//geral
			
		       //setNave
		       NavePassageiros navePassageiros = new NavePassageiros(nome, velocidadeMaxima, numeroTripulantes, combustivel, velocidade, distancia, numeroPassageiros);
		       
		       navePassageiros.setNome(nome);
		       navePassageiros.setVelocidadeMaxima(velocidadeMaxima);
		       navePassageiros.setVelocidade(velocidade);
		       navePassageiros.setCombustivel(combustivel);
		       navePassageiros.setDistancia(distancia);
		       navePassageiros.setNumeroTripulantes(numeroTripulantes);
		       navePassageiros.setNumeroPassageiros(numeroPassageiros);
	           
	           System.out.println(navePassageiros.toString());
	           
	            navePassageiros.acelerar();
	            navePassageiros.desacelerar();
	            navePassageiros.abastecer(combustivel);

	            
	            navePassageiros.embarcar(numeroPassageiros);
	            
	            System.out.println(navePassageiros.toString());
	            while(true) {
	            	System.out.println("deseja viajar ?");
	            	int opcao = Teclado.lerInteiro("1.sim \n 2-não");
	            			if(opcao == 1) {
	            				navePassageiros.viajar(distancia);
	            				break;
	            				} else {
	            					System.out.println("ok, até a próxima");
	            					System.exit(0);
	            					break;
	            			}
	            }
				break;
			case 3:
	            // Interagir com a nave de combate
	            String armamento = Teclado.lerString("Informe o armamento da nave:");
				
	            //geral
	            NaveCombate naveCombate = new NaveCombate(nome, velocidadeMaxima, numeroTripulantes, combustivel, velocidade, distancia, armamento);
				
				//setNave

				
				naveCombate.setNome(nome);
				naveCombate.setVelocidadeMaxima(velocidadeMaxima);
				naveCombate.setCombustivel(combustivel);
				naveCombate.setVelocidade(velocidade);
				naveCombate.setDistancia(distancia);
				naveCombate.setNumeroTripulantes(numeroTripulantes);
	            naveCombate.setArmamento(armamento);
	            
	            //metodos

	            naveCombate.acelerar();
	            naveCombate.desacelerar();
	            naveCombate.abastecer(combustivel);
	            
	            
	            naveCombate.atacar();
				
	            System.out.println(naveCombate.toString());
	            while(true) {
	            	System.out.println("deseja viajar ?");
	            	int opcao = Teclado.lerInteiro("1.sim \n 2-não");
	            			if(opcao == 1) {
	            				naveCombate.viajar(distancia);
	            				break;
	            				} else {
	            					System.out.println("ok, até a próxima");
	            					System.exit(0);
	            					break;
	            			}
	            }


				break;				
			case 0:
				System.out.println("Cancelar escolha de nave");
				break;
				default:
				System.out.println("Tipo de nave selecionado");
        	} 
        } while (tipoNave != 0);
    }
}
      