import java.util.Scanner;

//Exercícios curso: DIO-Estruturas de Repetição e Arrays em java.

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
*/

public class Ex3_MaiorEMedia {
	public static void main (String [ ] args){
		Scanner scan = new Scanner (System.in);
		
		int numero;
		int maior =0;
		int soma =0;
		int cont =0;
		
		System.out.println("---------------------------------------");
		do{
			System.out.println(" ");
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			soma = soma + numero;
			
			if(numero > maior) maior = numero;
			
			cont = cont +1;
			
		}while(cont <5 );
		System.out.println("---------------------------------------");
		System.out.println("O numero maior foi: " + maior);
		System.out.println("E a media dos números é: " + (soma/5));
		
		System.out.println("---------------------------------------");
		System.out.println("Programa encerrado com sucesso!");
		System.out.println("---------------------------------------");
	}
}
