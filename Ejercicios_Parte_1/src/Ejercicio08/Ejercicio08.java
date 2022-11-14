package Ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

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
		
		else if (edad < 18 )
		{
			System.out.println("No estoy en IF");
	
	    }
	
}}


