import java.util.Scanner;

public class verificacaoDeDados{
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		
		int [ ] idade = new int [2];
		String [ ] nome = new String [2];
		
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < 2; i++){
			System.out.println("Digite o nome: ");
			nome[i] = in.next();
			System.out.println("Digite a idade: ");
			idade[i] = in.nextInt();
		}
		
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < 2; i++){
			if (idade [i] <=10) {
				System.out.println(nome[i]+ " você é uma criança");
			}else if(idade [i] >=18){
				System.out.println(nome[i] + " você é um(a) jovem");
			}else{
				System.out.println(nome[i] + " você é um(a) adolescente"); 
			}
		}
		
		System.out.println("-------------------------------------------");
		
	}
}