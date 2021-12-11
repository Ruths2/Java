import java.util.Scanner;

//Exercícios curso: DIO-Estruturas de Repetição.

/*
Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.
*/

public class Ex4_ParOuImpar{
	public static void main (String [ ] args){
		Scanner scan = new Scanner (System.in);
		
		int quantNumeros;
		int numeros;
		int quantPares =0, quantImpares =0;
		
		System.out.println("---------------------------------------");
		System.out.println("Digite a quantidade de números: ");
		quantNumeros = scan.nextInt();
		System.out.println("---------------------------------------");
		
		int cont =0;
		do{
			System.out.println(" ");
			System.out.println("Digite um número: ");
			numeros = scan.nextInt();
			
			if(numeros % 2 == 0) quantPares++;
			else quantImpares++;
			
			cont++;
		}while(cont < quantNumeros);
		
		System.out.println("---------------------------------------");
		System.out.println("A quantidade de números pares é: " + quantPares + " e a quantidade de números impares foi: " + quantImpares);
		System.out.println("---------------------------------------");
	}
}

