package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		int numero;
		
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir numero: ");
		numero = leer.nextInt();
		leer.close();
		
		if ((numero % 10) == 0 ) 
		{
			System.out.println("Es multiplo de 10");
		}
		
		else {
			System.out.println("Este numero no es multiplo de 10");
		}
		

	}

}
