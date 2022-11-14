package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int x;
		int y;
		int suma;
		int resta;
		int producto;
		int division;
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Introducir x ");
		x = leer.nextInt();
		
		System.out.print("Introducir y ");
		y = leer.nextInt();
		
		suma = x + y;
		resta = x - y;
		producto = x * y;
		division = x / y;
		
		System.out.println(" x + y = " + suma);
		System.out.println(" x - y = " + resta);
		System.out.println(" x * y = " + producto);
		System.out.println(" x / y = " + division);
		
		leer.close();
		

	}

}
