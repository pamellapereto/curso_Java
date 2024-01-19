package logicaDeProgramacao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 10;
		char sexo = 'M';
		
		
		if (sexo == 'F' || idade < 18) {
			System.out.println("Não está dentro das normas do alistamento.");
		}
		
		else {
			System.out.println("Alistamento obrigatório!");
		}
		
		System.out.println("________________________________________");
		
		if (sexo == 'M') {
			if (idade >= 18) {
				System.out.println("Alistamento obrigatório!");
			}
			
			else {
				System.out.println("Você não tem a idade necessária.");
			}
		}
		
		else {
			System.out.println("É preciso ser do sexo masculino para se alistar"
					+ "com obrigatoriedade!");
		}	
	}
}
