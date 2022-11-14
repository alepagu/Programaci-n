package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int num1;
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir num1: ");
		num1 = leer.nextInt();
		leer.close();
		
		if (num1 >= 0)
		{
			System.out.println(num1 + " es positivo");
		}
		else
		{
			System.out.println(num1 + " es negativo");
		}

	}

}
