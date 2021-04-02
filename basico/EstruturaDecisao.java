package cursoJava.basico;

/*
 * 
 * 
 * 
 */

public class EstruturaDecisao {

	public static void main(String[] args) {
		
		String texto = 10 == 7?"Dez é igual a Sete":"Dez é diferente de sete";
		/*
		
		//IF
		int idade = 15;
		if(idade >= 18) {
			System.out.println("Já pode tirar a CNH");
		}
		
		//if else
		if(idade >= 18) {
			System.out.println("Já pode tirar a CNH");
		}else {
			System.out.println("Não tem idade para adirigir;");
		}
		
		String semaforo = "Vermelho";
		
		if(semaforo == "Verde") {
			System.out.println("Siga em frente!");
		}else if (semaforo == "Amarelo") {
			System.out.println("Tenha Atenção!");
		}else if (semaforo == "Vermelho") {
			System.out.println("Pare!");
		}else {
			System.out.println("Chame a Manutenção e a autoridade de trânsito!");
		}*/
		
		char opcao = 'b';
		
		switch (opcao) {
		
			case 'a': System.out.println("Cadastrar produto"); break;
			
			case 'b': System.out.println("Visualizar detalhes"); break;
			
			case 'c': System.out.println("Editar produto"); break;
			
			case 'd': System.out.println("deletar produto"); break;
			
			default: System.out.println("Opção Inválida"); ;
		}
				
	}

}
