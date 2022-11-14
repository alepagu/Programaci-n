package Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		int numero;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir numero entre 0 y 99999: ");
		numero = leer.nextInt();
		leer.close();
		
		if (numero <= 9)
		{
			System.out.println("Tiene una cifra");
		}
		else if (numero <= 99)
		{
			System.out.println("Tiene dos cifras");
		}
		else if (numero <= 999)
		{
			System.out.println("Tiene tres cifras");
		}
		else if (numero <= 9999)
		{
			System.out.println("Tiene cuatro cifras");
		}
		else if (numero <= 99999)
		{
			System.out.println("Tiene cinco cifras");
		}
		else 
		{
			System.out.println("Numero introducido no es valido");
		}

	}

}
