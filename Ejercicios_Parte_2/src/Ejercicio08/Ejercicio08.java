package Ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int bandera=1;
		int pos=0;
		int neg=0;
		int num;
		// TODO Auto-generated method stub
		
		Scanner leer;
		while(bandera<=5)
		{
			leer=new Scanner(System.in);
			System.out.println("Introducir número no nulo:");
			num=leer.nextInt();
			
		if(num!=0)
		{
			if(num>0)
			{
			pos++;
			}
			
			else
			{
				neg++;
			}
			
				bandera++;
		}
				else 
				{
					System.out.println("Número no válido");
				}
			}
			System.out.println("Números positivos: " + pos);
			System.out.println("Números negativos: " + neg);
		}
	}
