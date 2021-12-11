import java.util.Scanner;

//Exercícios curso: DIO-Estruturas de Repetição.

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

public class Ex6_Fatorial{
	public static void main (String [ ] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		System.out.println(" ");
		
		int mult =1;
		for (int i=num; i>=1; i--){
			mult *= i;
		}
		
		System.out.println("5!= " + mult);
		
		System.out.println(" ");
		System.out.println("Programa encerrado com sucesso!");
	}
}
