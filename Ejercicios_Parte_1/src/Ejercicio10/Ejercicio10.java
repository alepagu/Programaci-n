package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int x;
		int y;
		int suma;
		int resta;
		int producto;
		int division;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir x: ");
		x = leer.nextInt();
		
		System.out.println("Introducir y: ");
		y = leer.nextInt();
		leer.close();
		
		suma = x + y;
		resta = x - y;
		producto = x * y;
		division = x / y;
		
		System.out.println("Suma = " + suma);
		
		System.out.println("Resta = "+ resta);
		
		System.out.println("Producto = " + producto);
		
		if ((x != 0) && (y != 0))
		{
		System.out.println("Division = " + division);	
		}
		
		else
		{
		System.out.println("No se puede resolver ya que uno de los numeros es 0 ");
		}

	}

}
