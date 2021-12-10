/*
Objetivo do programa: realizar cálculos básicos de uma calculadora.
*/
import java.util.Scanner;

public class calculadora{
	public static void main (String [] args){
		
//Declaração variáveis.
	float valor1, valor2;
	String opera;
	
//Entrada e armazenamento de dados.
		Scanner in = new Scanner (System.in);
	
		System.out.println("---------------------------------------------");
		System.out.println("Entre com o primeiro número: " + " ");
		valor1 = in.nextFloat();
		System.out.println(" ");
		System.out.println("Entre com o segundo número: ");
		valor2 = in.nextFloat();
		System.out.println("---------------------------------------------");
		System.out.println("Qual a operação desejada?\n Ex:\n + para adição\n - para subtração\n x para multiplicação\n / para divisão)");
		opera = in.next();
	
/*Tomada de decissões, operação matemáticas e resultados.
*/
		System.out.println("---------------------------------------------" );
		if (opera.equals("+")) {
			System.out.println(" O resultado é: " + (valor1 + valor2));
		}else if (opera.equals("-")) {
			System.out.println("O resultado é: " +
			(valor1 - valor2));
		}else if (opera.equals("x")) {
			System.out.println("O resultado é: " +
			(valor1 * valor2));
		}else if (opera.equals("/")) {
			System.out.println("O resultado é: " +
			(valor1 / valor2));
		}else{
			System.out.println("Expresão não é valida");
		}
		
		System.out.println("---------------------------------------------" );
		
	}
}