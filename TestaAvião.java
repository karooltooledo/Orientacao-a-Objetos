package OrientacaoObjetos;

public class TestaAvi�o {

	public static void main(String[] args) {
		
		//Inst�ncia
		
		Avi�o a1 = new Avi�o();
		
		//Declarando valores aos atributos
		a1.passageiros = 268;
		a1.piloto = 3;
		a1.aeromocas = 8;
		a1.codigoVoo = 1073;
		
		//Chamando o m�todos
		a1.dadosVoo();
		
		//Imprimindo
		System.out.println("\nNo Avi�o, possu�mos o total de " + a1.passageiros + " passageiros, " + a1.piloto + " pilotos, e " + a1.aeromocas + " aeromo�as.");
		System.out.println("\nTenham uma �tima viagem e sejam bem-vindos ao v�o " + a1.codigoVoo + "!");
	}
	

}
