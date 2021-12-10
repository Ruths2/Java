import java.util.Scanner;

public class matriz{
	public static void main (String [] args){
		
		int [ ][ ] matriz = new int  [2][2];
		
		matriz[0] [0] = 9;
		matriz[0] [1] = 5;
		matriz[1] [0] = 4;
		matriz[1] [1] = 2;
		
		for (int i = 0; i < matriz.length ; i++){
			for (int j = 0; j < matriz[1].length; j++){
				System.out.println(matriz[i] [j]);
			}
		}
	}
}