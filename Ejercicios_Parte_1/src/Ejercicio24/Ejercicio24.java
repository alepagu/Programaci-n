package Ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		int opcion = 1;
		double montodia = 0;
		double montoTotal = 0;
		
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		while (opcion != 0)
		{
			System.out.println("********************");
			System.out.println("        TIENDAS DON PEPE        ");
			System.out.println("Seleccionar que día para el ingreso del monto de compra ");
			System.out.println("1- Lunes");
			System.out.println("2- Martes");
			System.out.println("3- Miercoles");
			System.out.println("4- Jueves");
			System.out.println("5- Viernes");
			System.out.println("6- Sabado");
			System.out.println("7- Domingo");
			System.out.println("0- SALIR");
			System.out.println("Insertar Dia: ");
			opcion = leer.nextInt();
			
			switch (opcion)
			{
			case 0:
				System.out.println("Adiós");
				break;
				
			case 2:
			case 4:
				System.out.println("********************");
				System.out.println("Insertar monto del dia");
				montodia = leer.nextInt();
				System.out.println("Con el descuento: " + (montodia - (montodia * 0.15)));
				montoTotal = montoTotal + (montodia - (montodia * 0.15));
				break;
				
		    default:
		    	System.out.println("**************************");
				System.out.println("Insertar monto del día:");
				montodia=leer.nextInt();
				montoTotal=montoTotal+montodia;
				break;
			}
		}

		System.out.println("**************************");
		System.out.println("      TIENDAS DON PEPE    ");
		System.out.println("Las ganancias son:");
		System.out.println(montoTotal);
		
		leer.close();

	}

}
