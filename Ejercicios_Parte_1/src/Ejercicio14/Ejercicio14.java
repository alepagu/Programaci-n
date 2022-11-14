package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int num1;
		int num2;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir num1: ");
		num1 = leer.nextInt();
		System.out.println("Introducir num2: ");
		num2 = leer.nextInt();
		leer.close();
		
		if (num1 > num2)
		{
			System.out.println("Es mayor: " + num1);
		}
		
		else if (num1 == num2) 
		{
			System.out.println("Los numeros introducidos son iguales");
		}
		
		else 
		{
			System.out.println("Es mayor: " + num2);
		}

	}

}
