package generation.metodo;

public class TestaMetodosFora {
	
	static String metodo6(int i, int f) {
		String numeroString = ""; 
		
		for(int c = i; c <= f; c++) {
			numeroString = numeroString + c + " ";
		}
		return numeroString;
	}
	static void metodo7() {
		System.out.println("Java é massa demais!!!");
	}
}
