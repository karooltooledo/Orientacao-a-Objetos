package OrientacaoObjetos;

public class Cliente {
	
	//Atributos
	String nome;
	String sexo;
	String telefone;
	int valorCompra;
	
	//Métodos
	void dadosCliente() {
		System.out.println("O cliente se chama " + nome + ", é de sexo " + sexo + ", e seu telefone é o " + telefone);
	}
	void compraCliente() {
		System.out.println("Esse cliente comprou " + valorCompra + " reais de produtos");
	}
}
