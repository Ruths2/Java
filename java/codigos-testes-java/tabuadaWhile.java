import java.util.Scanner;

class tabuadaWhile {
	public static void main (String [] args){
		
		int entrada ;
		int multiplicador = 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		entrada = scanner.nextInt();
		System.out.println(" ");
		
		while (multiplicador <=10){
			System.out.println(entrada + " x " + multiplicador + " = " + entrada*multiplicador);
			multiplicador++;
		}
	}
}
