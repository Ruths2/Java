import java.util.Scanner;

public class tabuadaFor{
	
	public static void main (String [] args){
		
		int entrada;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		entrada = scanner.nextInt();
		
		for( int i = 0; i <11; i++ ) {
			System.out.println(entrada + "x" + i + "=" + (entrada*i));
			
		}
	}
}