package OrientacaoObjetos;

public class Cliente {
	
	//Atributos
	String nome;
	String sexo;
	String telefone;
	int valorCompra;
	
	//M�todos
	void dadosCliente() {
		System.out.println("O cliente se chama " + nome + ", � de sexo " + sexo + ", e seu telefone � o " + telefone);
	}
	void compraCliente() {
		System.out.println("Esse cliente comprou " + valorCompra + " reais de produtos");
	}
}
