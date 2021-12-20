//Exercícios curso: DIO-Estruturas de Repetição e Arrays em java.

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa{
	public static void main(String [ ] args){
		int [ ] vetor = {0,45,3,7,11,33};
		
//------------------------------------------------------------------//

     //duas formas de imprimir o vetor em ordem crescente:
     
		int cont=0;
		while(cont <= (vetor.length -1)){
//ou ...
		//while (cont < (vetor.length)){
			System.out.print(vetor[cont] +" ");
				cont++;
		}
		
		System.out.println(" ");
		
		for (int i=0; i <= (vetor.length -1); i++){
//ou ...
//for(int i=0; i < vetor.length; i++){
			System.out.print(vetor[i] +" ");
		}
		System.out.println(" ");
//------------------------------------------------------------------//
	
	   //duas formas de imprimir o vetor em ordem decrescente:
	
		//int cont = (vetor.length -1);
		//while(cont >= 0){
			//System.out.print(vetor[cont] +" ");
			//cont--;
		//}
		//System.out.println(" ");
		
		for (int i=(vetor.length -1); i >= 0; i--){
			System.out.print(vetor[i] +" ");
		}
		System.out.println(" ");
	}
}
