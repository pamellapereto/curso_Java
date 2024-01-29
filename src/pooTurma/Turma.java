package pooTurma;

public class Turma extends Senac {
	String mencao;
	String emailEducacional;
	
	//Construtor
	public Turma() {
		System.out.println("");
		System.out.println("Unidade Curricular 10 | Banco de Dados");
	}
	
	public void unidadeCurricular() {
		if (mencao == "D") {
			aprovarAluno();
		}
	
		else {
			reprovarAluno();
		}
	}

	private void aprovarAluno() {
		System.out.println("Aluno(a) aprovado(a)!");
	}
	
	private void reprovarAluno() {
		System.out.println("Aluno(a) REPROVADO(A)!");
	}
}
