import java.util.Scanner;

//Exercícios curso: DIO-Estruturas de Repetição.

/*
 Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeIdade{
	public static void main (String [ ] args) {
		Scanner scan = new Scanner (System.in);
		
		String nome;
		int idade;
		
		while(true){
			System.out.println("__________________________________");
			System.out.println("Digite nome: ");
			nome = scan.next();
			if (nome.equals("0")) break;
			
			System.out.println("Digite idade: ");
			idade = scan.nextInt();
			}
		
		System.out.println("__________________________________");
		System.out.println("Programa encerrado com sucesso!");
	}
}