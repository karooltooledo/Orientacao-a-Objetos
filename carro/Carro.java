package generation.carro;

public class Carro {
		//Atributos - variáveis
	String nome;
	String marca;
	String ano;
	int velocidade;
	
	//métodos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}
