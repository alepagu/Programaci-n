package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int N;
		Scanner leer;
		// TODO Auto-generated method stub
		
		leer = new Scanner(System.in);
		System.out.println("Introducir numero para hacer el factorial ");
		N = leer.nextInt();
		leer.close();
		
		int factorial = 1;
		System.out.println("0!= 1");
		for (int i=1; i<=N; i++)
		{
			factorial = (factorial * i);
			System.out.println(i + "!=" + (factorial));
		}

	}

}
