package OrientacaoObjetos;

public class TestaAvião {

	public static void main(String[] args) {
		
		//Instância
		
		Avião a1 = new Avião();
		
		//Declarando valores aos atributos
		a1.passageiros = 268;
		a1.piloto = 3;
		a1.aeromocas = 8;
		a1.codigoVoo = 1073;
		
		//Chamando o métodos
		a1.dadosVoo();
		
		//Imprimindo
		System.out.println("\nNo Avião, possuímos o total de " + a1.passageiros + " passageiros, " + a1.piloto + " pilotos, e " + a1.aeromocas + " aeromoças.");
		System.out.println("\nTenham uma ótima viagem e sejam bem-vindos ao vôo " + a1.codigoVoo + "!");
	}
	

}
