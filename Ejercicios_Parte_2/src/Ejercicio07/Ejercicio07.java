package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
	 int bandera=1;
		int neg=0;
		int num;
		
		// TODO Auto-generated method stub
		
		Scanner leer;
		while(bandera<=5)
		{
			System.out.println("Introducir un número distinto de cero");
			leer=new Scanner(System.in);
			num=leer.nextInt();
			
			if(num!=0)
			{
				if(num<0)
				{
				neg++;
				}
				
			bandera++;
			
			}
			else
			{
				System.out.println("Numero no Válido");
			}
			
		}
		System.out.println(" Números negativos: " + neg);

	}
}

