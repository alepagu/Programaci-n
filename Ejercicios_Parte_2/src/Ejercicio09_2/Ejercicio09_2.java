package Ejercicio09_2;

import java.util.Scanner;

public class Ejercicio09_2 {

	public static void main(String[] args) {
		int pos=0;
		int neg=0;
		int i;
		
		// TODO Auto-generated method stub
		
		do
		{
			System.out.println("Introduce un numero distinto de 0:");
			Scanner leer=new Scanner(System.in);
			i=leer.nextInt();
		
				if (i>0)
				{
				pos++;
				}
				else if (i<0)
				{
				neg++;
				}
				
		}while(i!=0);
		
			System.out.println("Se han leído " + pos + " números positivos.");
			System.out.println("Se han leído " + neg + " números negativos.");
		
	}

}
