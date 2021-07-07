package generation.carro2;

public class TestaCarro02 {

	public static void main(String[] args) {
		
		//Objeto
		Carro02 carro1 = new Carro02();
		
		//Declarar valores aos Atributos
		
		carro1.setMarca("Fiat");
		carro1.setModelo("Tipo");
		carro1.setNumPassageiros(5);
		carro1.setCapacidadeCombustivel(45);
		
		System.out.println("Carro: " + carro1.getMarca());

	}

}
