package generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		//Instância --> criação do Objeto
		
		Aluno aluno1 = new Aluno();
		
		//Declarando Valores aos Atributos
		aluno1.nome = "Karol";
		aluno1.curso = "Curso Java Generation";
		aluno1.idade = 22;
		
		//Chamamento --> de Metodos
		aluno1.assistirAula();
		aluno1.fazerAtividade();
		aluno1.fazerProva();
		
		//Imprimir
		System.out.println(aluno1.nome);
		System.out.println(aluno1.curso);
	}

}
