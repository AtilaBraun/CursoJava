package cursoJava.basico;
/*
 *Classe de explicação e demosntração dos operadores
 *
 * Versão: 1.0
 */
public class Operadores {

	public static void main(String[] args) {
	
		int numero1 = 10, numero2 = 8, numero3 = 5, numero4 = 10;
		
		//Operadores + - * / %
		
		int resultado1 = numero1 + numero2;
			System.out.println("Soma: " + resultado1);
		int resultado2 = numero1 - numero2;
			System.out.println("Subtraçao: " + resultado2);
		int resultado3 = numero1 * numero2;
			System.out.println("Multiplicação: " + resultado3);
		double resultado4 = (double)numero1 / numero2;
			System.out.println("Divisão: " + resultado4);
		int resultado5 = numero1 % numero2;
			System.out.println("Módulo: " + resultado5);
			
		System.out.println();
			
		//numero3 = numero3 + 1;
		System.out.println(numero3++);
		System.out.println(numero3);
		System.out.println(++numero4);
		
		System.out.println();
		
		/*
		 * ++
		 * --
		 * +=10
		 * *=3
		 * =4
		 */
		
		System.out.println(numero1==numero2);
		System.out.println(numero1!=numero2);
		System.out.println(numero1 > numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 <= numero2);
		
		System.out.println();
		
		//Operadores logicos && ||
		
		System.out.println("Falso E Falso: " + (false&&false));
		System.out.println("Falso E verdadeiro: " + (false&&true));
		System.out.println("Verdadeiro E Falso: " + (true&&false));
		System.out.println("Verdadeiro E Verdadeiro: " + (true&&true));
		
		System.out.println();
		
		System.out.println("Falso OU Falso: " + (false||false));
		System.out.println("Falso OU verdadeiro: " + (false||true));
		System.out.println("Verdadeiro OU Falso: " + (true||false));
		System.out.println("Verdadeiro OU Verdadeiro: " + (true||true));
	}

}
