package OrientacaoObjetos;

public abstract class TestaCliente {

	public static void main(String[] args) {
		
		// Inst�ncia 
		Cliente c1 = new Cliente();
		
		//Declarando valores aos atributos
		c1.nome = "Karoline Toledo";
		c1.sexo = "Feminino";
		c1.telefone = "11 997896680";
		c1.valorCompra = 250;
		
		//Chamando e imprimindo os m�todos
		c1.dadosCliente();
		c1.compraCliente();
	}

}
