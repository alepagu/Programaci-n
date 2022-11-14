package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int x;
		int y;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir x ");
		x = leer.nextInt();
		
		System.out.println("Introducir y ");
		y = leer.nextInt();
		leer.close();
		
		if (x > y){
			System.out.println(x + " es el mayor ");
		}
		else
		{System.out.println(y + " es el mayor");
		   }
		
		}
	}


