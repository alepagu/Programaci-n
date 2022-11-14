package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		String espacio="";
		String ast="*";
		int h;//h es altura que se quiere
		Scanner leer;
		// TODO Auto-generated method stub
		
		leer=new Scanner(System.in);
		System.out.println("Indica la altura que desea:");
		h=leer.nextInt();
		
		for (int i=1;i<=h;i++)
		{

				espacio=espacio + "  ";
			}	
			System.out.println(ast + espacio);
		ast= ast + "*";
		espacio="";
		
		
		
leer.close();
	}

}

