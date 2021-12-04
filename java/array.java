import java.util.Scanner;

public class array{
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		int [] array = new int [6];
		
		for (int posicao = 1; posicao < array.length; posicao++){
			System.out.println("Digite o valor da posição " + posicao + " na array");
			array[posicao] = scan.nextInt();
			
		}
		
		System.out.println("............................................");
		
		for (int posicao = 1; posicao < array.length; posicao++){
			System.out.println("A posição número " + posicao + " tem o valor de: " + array[posicao]);
		
		}
	}
}