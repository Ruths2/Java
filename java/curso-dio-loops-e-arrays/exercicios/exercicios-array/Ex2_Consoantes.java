//Exercícios curso: DIO-Estruturas de Repetição e Arrays em java.

/*
Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes{
	public static void main(String [ ] args){
		Scanner scan = new Scanner(System.in);
		
		String [ ] vetor = new String [3];
		int quantConso = 0;
		int cont = 0;
		
		do{
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase ("a") |
				letra.equalsIgnoreCase ("e") |
				letra.equalsIgnoreCase ("i") |
				letra.equalsIgnoreCase ("o") |
				letra.equalsIgnoreCase ("u"))){
				vetor[cont] = letra;
				quantConso++;
			}
			cont++;
		}while(cont < vetor.length);
		
		System.out.println(" ");
		for( String consoantes : vetor ){
			if(consoantes != null){
				System.out.print(consoantes + " ");
			}
		}
		System.out.println("\n");
		for(int i=0; i<vetor.length; i++){
			System.out.println(vetor[i] + " ");
		}
	}
}