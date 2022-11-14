package Ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int edad;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce tu edad ");
		edad = leer.nextInt();
		leer.close();
		
		if (edad >= 18)
		{
			System.out.println("Eres mayor de edad ");
		}
		
		else if (edad < 18)
		{
			System.out.println("Eres menor de edad");
		}

	}

}
