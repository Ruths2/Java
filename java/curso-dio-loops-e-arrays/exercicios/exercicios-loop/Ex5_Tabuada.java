import java.util.Scanner;

//Exercícios curso: DIO-Estruturas de Repetição.

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_Tabuada {
	public static void main (String [ ] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		
		System.out.println(" ");
		System.out.println("Tabuada do " + num + ":");
		for (int i=1; i<=10; i++){
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		
		System.out.println(" ");
		System.out.println("Programa encerrado com sucesso!");
	}
}