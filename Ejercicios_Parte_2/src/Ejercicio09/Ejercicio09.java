package Ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int pos=0;
		int neg=0;

		// TODO Auto-generated method stub
		
		Scanner leer;
		leer=new Scanner(System.in);
		System.out.println("Introduce un numero distinto de 0:");
		int i= leer.nextInt();
		
		while (i!=0)
		{
			if (i>0)
			{
			pos ++;
			}
			else
			{
			neg++;
			}
			System.out.println("Introduce un numero distinto de 0:");
			leer=new Scanner(System.in);
			i=leer.nextInt();
		}
		
		System.out.println(i);
		System.out.println("Se han leído " + pos + " números positivos.");
		System.out.println("Se han leído " + neg + " números negativos.");
        leer.close();
	}

}
