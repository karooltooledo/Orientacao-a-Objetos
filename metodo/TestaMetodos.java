package generation.metodo;
			
	//Nome da Classe
public class TestaMetodos {
	
	//Atributos - Caracter�sticas da Classe
	static int numero1 = 100;
	static int numero2 = 300;
	static int soma = 0;
	
	//M�todos -> A��es dentro da Classe
	public static void main(String[] args) {
		
		metodo1();
		metodo2();
		metodo3();
		metodo4(20,60);
		metodo5();
		TestaMetodosFora.metodo7();
	}
	public static void metodo1() {
		System.out.println("Este � o primeiro m�todo!!");
	}
	public static void metodo2() {
		soma = numero1 + numero2;
	}
	public static void metodo3() {
		System.out.println("A soma �: " + soma);
	}
	public static void metodo4(int numero3, int numero4) {
		int soma2 = numero3 + numero4;
		System.out.println("Eu sou o m�todo 4: " + soma2);
	}
	public static void metodo5() {
		System.out.println("\nContando... String com FOR...");
		System.out.println(TestaMetodosFora.metodo6(1, 10));
	}
	
}
