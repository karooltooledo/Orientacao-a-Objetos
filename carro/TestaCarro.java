package generation.carro;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.nome = "Fusca";
		c1.marca = "Volks";
		c1.ano= "1998";
		c1.velocidade = 0;	
		
		c1.acelerar(30);
		System.out.println("Carro: " + c1.nome);
		System.out.println("Velocidade: " + c1.velocidade + "km/h");
		
		c1.freiar(10);
		System.out.println("Carro: " + c1.nome);
		System.out.println("Velocidade: " + c1.velocidade + "km/h");
	}

}
