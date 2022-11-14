package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		String asterisco="*";
		String espacio="";
		//String dibujo";
		int h;//h es altura que se desea
		
		// TODO Auto-generated method stub
		
		Scanner leer;
		leer=new Scanner(System.in);
		System.out.println("Indica la altura que desea:");
		h=leer.nextInt();
		
		for (int i=0;i<h;i++) {
		
			for (int j=i;j<(h-1);j++)
			{
				asterisco= asterisco + "**";
			}
				System.out.println(espacio + asterisco);
				espacio = espacio+" ";
				asterisco="*";
			
		}
      leer.close();
	}

}
