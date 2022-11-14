package Ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
		int opcion;
		Scanner leer;
		// TODO Auto-generated method stub
		do
		{
			
			
			System.out.println("************* Bienvenido **************");
			System.out.println("Puntaje del casino");
			System.out.println("0- Salir del puntaje del casino");
			System.out.println("1- Los 3 dados sacan 6");
			System.out.println("2- 1 dado no obtiene un 6");
			System.out.println("3- Solo 1 dado da 6");
			System.out.println("4- Ningun dado obtiene un 6");
			
			System.out.println("Introduce la opcion obtenida");
			leer = new Scanner(System.in);
			opcion = leer.nextInt();
			
				switch (opcion)
				{
				case 1:
					System.out.println("Excelente");
					break;
					
				case 2:
					System.out.println("Muy bien");
					break;
					
				case 3:
					System.out.println("Regular");
					break;
					
				case 4:
					System.out.println("Pésimo");
					break;
					
				case 0:
					System.out.println("*******************");
					System.out.println("Saliendo del puntaje del casino");
					break;
				
					default:
						System.out.println("Opcion no valida");
						break;
					
				}
			
		}
		while(opcion!=0);
		leer.close();
		
	}

}
