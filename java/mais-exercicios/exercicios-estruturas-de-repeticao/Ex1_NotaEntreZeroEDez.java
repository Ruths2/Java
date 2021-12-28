/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex1_NotaEntreZeroEDez{
	public static void main (String [ ] args){
		Scanner scan = new Scanner(System.in);
		
		int num;
		
// -------------Resolução com do/while--------------//

		do{
			System.out.println("Digite um valor de 0 a 10: ");
			num = scan.nextInt();
			if(num >0 && num <10){
				System.out.println("Valor válidado com sucesso!");
			}else{
				System.out.println("Valor inválido!");
			}
		}while(num > 10);

		
// ---------------Resolução com while-----------------//
/*
		while(true){
			System.out.println("Digite um valor de 0 até 10: ");
			num = scan.nextInt();
			if(num >=0 && num <= 10) {
				break;
			}else{
				System.out.println("Valor inválido!" );
			}
		}
		System.out.println("Valor válidado com sucesso!");
*/
	}
}