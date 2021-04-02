package cursoJava.basico;
/*
 * Classe que exemplifica funções.
 * 
 * Versão: 1.0
 * 
 */
public class Funcoes {

	public static void main(String[] args) {

		int result = soma(10,60);
		
		System.out.println(result);
		
		quadrado(7);
		
		String texto = mensagem();
		
		System.out.println(texto);
		
		olaMundo();
		
		int nota = 7;
		
		//Operador ternário.
		
		String resultado = nota >= 7? "Você foi APROVADO!":"Você ficou de RECUPERAÇÃO!";
		
		System.out.println(resultado);
		
	}
	//com retorno do tipo int e recebe dois parâmetros.
	static int soma(int a, int b) {
		
		return a + b;
	}
	
	static void quadrado(int numero) {
		
		System.out.println(numero*numero);
	}
	
	static String mensagem() {
		
		return "Mensagem do Sistema";
	}
	
	static void olaMundo() {
		System.out.println("Olá Mundo!!!");
	}
}
