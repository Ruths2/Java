import java.util.Scanner;
import java.util.Arrays;

public class matriz{
	public static void main (String [] args){
		
		int [ ][ ] matriz = new int  [2][2];
		
		matriz[0] [0] = 9;
		matriz[0] [1] = 5;
		matriz[1] [0] = 4;
		matriz[1] [1] = 2;
		
		System.out.println( );
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length ; i++){
			for (int j = 0; j < matriz[i].length; j++){
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println( );
		}
		System.out.println( );
	}
}