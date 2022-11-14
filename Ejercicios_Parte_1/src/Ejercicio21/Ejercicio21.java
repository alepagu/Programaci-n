package Ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
        
	public static void main(String[] args) {
		int horasTrabajadas;
		
		int tarifaNormal=1;
		double tarifaPlus=1.5;
		
		double sueldo;
		
		double impuestos=0;
		double neto=0;
		
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("Insertar el numero de horas trabajadas");
		horasTrabajadas=leer.nextInt();
		leer.close();
		
		if (horasTrabajadas <= 35)
		{
			System.out.println("Sueldo: "+ (horasTrabajadas * tarifaNormal));
		}
		else
		{
			sueldo = 35 * tarifaNormal;
			horasTrabajadas = horasTrabajadas - 35;
			sueldo=sueldo + (horasTrabajadas * tarifaPlus);
			neto = sueldo;
			
			if (sueldo > 500)
			{
				sueldo = sueldo - 500;
				
				if (sueldo > 400)
				{
					impuestos = impuestos + ((sueldo * 15)/100);
					sueldo = sueldo - 400;
					
					impuestos = impuestos + ((sueldo * 25)/100);
				}
				else
				{
					impuestos = (sueldo * 15)/100;
				}
				
			}
		}
		
		System.out.println("Sueldo neto: " + neto);
		System.out.println("Sueldo bruto: " + (neto - impuestos));
		System.out.println("Impuestos: " + impuestos);
		
	}

}
