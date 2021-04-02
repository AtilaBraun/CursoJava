package cursoJava.basico;
/*
 * Classe demonstrativa de variáveis e constantes. 
 * 
 * Versão: 1.0
 */
public class VariaveisEConstantes {

	public static void main(String[] args) {
	
		//Criação de Constante
		
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Criação de variáveis
		String nome = "José";
		
		int idade = 48;
		
		double peso = 73.4, altura = 1.73;
		
		char sexo = 'M', cnh = 'A';
		
		boolean doadorOrgaos = true;
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
		System.out.println("Habilitação: " + cnh);
		System.out.println("Doador de Orgãos: " + doadorOrgaos);
		System.out.println("Gravidade na terra: " + ACELERACAO_GRAVIDADE_TERRA + " M/S²");

	}

}
