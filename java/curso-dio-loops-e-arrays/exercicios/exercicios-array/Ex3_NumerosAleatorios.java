//Exercícios curso: DIO-Estruturas de Repetição e Arrays em java.

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios{
	public static void main(String [ ] args){
		Random random = new Random( );
		
		int [ ] numAleat = new int [20];
		
		for(int i = 0; i < numAleat.length; i++){
			int num = random.nextInt(100);
			numAleat[i] = num;
		}
		
		System.out.println("\nAntecessores dos Números aleatorios: ");
		for(int numeros : numAleat){
			System.out.print((numeros-1) + " ");
		}
		
		System.out.println("\nNúmeros aleatorios: ");
		for(int numeros : numAleat){
			System.out.print(numeros + " ");
		}
		
		System.out.println("\nSucessores dos números aleatorios: ");
		for(int numeros : numAleat){
			System.out.print((numeros+1) + " ");
		}
		System.out.println("\n");
	}
}