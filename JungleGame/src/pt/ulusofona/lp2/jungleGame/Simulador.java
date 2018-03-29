package pt.ulusofona.lp2.jungleGame;

public class Simulador {

	public static void main(String[] args) {
		
		System.out.println("Inicio Simula��o");
		
		// Cria��o objecto sem Inicializa��o
		Animal tarzan = new Animal();
		tarzan.setNome("Tarzan");
		tarzan.setId(0);
		tarzan.setIdEspecie(3);
		tarzan.setVelocidade(1);
		tarzan.setEnergia(3);
		
		// Cria��o de objecto com construtor inicializa��o
		Animal simba = new Animal("Simba", 1, 4, 2, 2);
		
		String linhaFicheiro = "Sabichao:2:6:1:1";
		Animal sabichao = Animal.criarAnimal(linhaFicheiro);
		
		// Visualiza��o resumida
		System.out.println(tarzan);
		System.out.println(simba);
		System.out.println(sabichao);
		
		// Visualiza��o extendida
		tarzan.mostraAnimal();
		simba.mostraAnimal();
		sabichao.mostraAnimal();
		
	}

}
