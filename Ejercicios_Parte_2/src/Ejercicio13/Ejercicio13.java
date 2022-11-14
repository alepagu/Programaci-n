package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		String cadena="";
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir Altura");
		int altura=leer.nextInt();
		
		for(int i=1;i<=altura;i++)
		{
			cadena=cadena+i;
			System.out.println(cadena);
		}
		
		leer.close();
		
	}		

}


