/////////////////////////////////////////////////////////////////

import java.util.*;

public class OiPessoal{
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		
/////////////////////////////////////////////////////////////////

		System.out.println( "Vamos calcular o seu IMC!");
		System.out.println("Digite o seu peso: ");
		Float peso = input.nextFloat();
		System.out.println("Digite a sua altura: ");
		Float altura = input.nextFloat();
		Float imc = peso/(altura*2);
		
/////////////////////////////////////////////////////////////////

		System.out.println("O seu IMC é de " + imc );
		
		}
}
/////////////////////////////////////////////////////////////////