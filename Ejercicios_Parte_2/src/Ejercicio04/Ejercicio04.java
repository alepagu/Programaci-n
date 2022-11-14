package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int N;
		Scanner leer;
		// TODO Auto-generated method stub
		
		leer = new Scanner(System.in);
		System.out.println("Introducir numero en el que desea finalizar el bucle:");
		N = leer.nextInt();
		 leer.close();
		 
		for (int i= 1; i<=N; i++)
		{
			System.out.println(i);
		}
		
     
      
	}

}
