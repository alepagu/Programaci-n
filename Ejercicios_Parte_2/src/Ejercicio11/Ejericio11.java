package Ejercicio11;

import java.util.Scanner;

public class Ejericio11 {

	public static void main(String[] args) {
		String espacio="";
		String ast="*";
		int h;//h es altura que se quiere
		Scanner leer;
		// TODO Auto-generated method stub
		
		leer=new Scanner(System.in);
		System.out.println("Indica la altura que desea:");
		h=leer.nextInt();
		
		for (int i=0;i<h;i++)
		{
			for (int j=i;j<(h-1);j++)
			{
				espacio=espacio + "  ";
			}	
			System.out.println(ast + espacio);
		ast= ast + "*";
		espacio="";
		}
		
		
leer.close();

	}

}
