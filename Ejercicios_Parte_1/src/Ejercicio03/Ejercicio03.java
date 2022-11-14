package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int lado;
		int area;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca lado");
		lado = leer.nextInt();
		
		area = lado * lado;
		System.out.println("El area es " + area);
		
		leer.close();
	}
}

