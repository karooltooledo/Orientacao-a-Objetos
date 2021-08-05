package generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		Aluno aluno1 = new Aluno();
		FuncAdm func1 = new FuncAdm();
		
		func1.setNome("João Pedro");
		func1.setSalario(5000.00);
		func1.setSetor("Tecnologia!");
		aluno1.setNome("Daiane");
		prof1.setNome("Joel!"); // ---> SET - Ele modifica o atributo
		
		System.out.println("Nome do Professor: " + prof1.getNome()); // --> GET - Recupera o dado
		System.out.println("O nome do aluno é: " + aluno1.getNome());
		System.out.println("\n=== Dados do Funcionario ===");
		System.out.println("Nome: " + func1.getNome());
		System.out.println("Salário: " + func1.getSalario());
		System.out.println("Setor: " + func1.getSetor());
	}

}
