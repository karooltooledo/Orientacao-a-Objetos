package generation.carro;

public class Carro {
		//Atributos - vari�veis
	String nome;
	String marca;
	String ano;
	int velocidade;
	
	//m�todos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}
