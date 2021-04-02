package cursoJava.basico;
/*
 * Classe que exemplifica fun��es.
 * 
 * Vers�o: 1.0
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
		
		//Operador tern�rio.
		
		String resultado = nota >= 7? "Voc� foi APROVADO!":"Voc� ficou de RECUPERA��O!";
		
		System.out.println(resultado);
		
	}
	//com retorno do tipo int e recebe dois par�metros.
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
		System.out.println("Ol� Mundo!!!");
	}
}
