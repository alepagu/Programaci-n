package Ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		String nombre;
		int matricula;
		int mensualidad;
		int porcentaje;
		int monto;
		int montofinal;
		
		// TODO Auto-generated method stub
		
		System.out.println("************************");
		System.out.println("Iniciando programa");
		System.out.println("1- Ingieneria de sistemas");
		System.out.println("2- Derecho");
		System.out.println("3- Ingieneria naviera");
		System.out.println("4- Ingieneria pesquera");
		System.out.println("5- Contabilidad");
		System.out.println("6- Administracion");
		System.out.println("0- Salir de la aplicacion");
		int opcion;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la opcion deseada:");
		opcion = leer.nextInt();
		System.out.println("Introduce la cantidad de matriculas");
		matricula = leer.nextInt();
		
		if (matricula != 0)
		{
			switch (opcion)
			{
			case 1:
				System.out.println("Introducir nombre completo del postulante:");
				nombre = leer.next();
				System.out.println(nombre + " Ingieneria de sistemas");
				matricula = 350;
				mensualidad = 650;
				System.out.println(matricula);
				System.out.println(mensualidad);
				monto = (matricula + mensualidad);
				porcentaje = ((monto * 18) / 100);
				System.out.println(porcentaje);
				montofinal = (monto + porcentaje);
				System.out.println("El monto final de " + nombre + " es de " + montofinal);
			break;
			
			case 2:
				System.out.println("Introducir nombre del postulante:");
				nombre = leer.next();
				System.out.println(nombre + " Derecho");
				matricula = 300;
				mensualidad = 550;
				System.out.println(matricula);
				System.out.println(mensualidad);
				monto = (matricula + mensualidad);
				porcentaje = ((monto * 18) / 100);
				System.out.println(porcentaje);
				montofinal = (monto + porcentaje);
				System.out.println("El monto final de " + nombre + " es de " + montofinal);
				break;
				
			case 3:
				System.out.println("Introducir nombre del postulante:");
				nombre = leer.next();
				System.out.println(nombre + " Ingieneria Naviera");
				matricula = 300;
				mensualidad = 500;
				System.out.println(matricula);
				System.out.println(mensualidad);
				monto = (matricula + mensualidad);
				porcentaje = ((monto * 18) / 100);
				System.out.println(porcentaje);
				montofinal = (monto + porcentaje);
				System.out.println("El monto final de " + nombre + " es de " + montofinal);
				break;
				
			case 4:
				System.out.println("Introducir nombre del postulante:");
				nombre = leer.next();
				System.out.println(nombre + " Ingieneria Pesquera");
				matricula = 310;
				mensualidad = 460;
				System.out.println(matricula);
				System.out.println(mensualidad);
				monto = (matricula + mensualidad);
				porcentaje = ((monto * 18) / 100);
				System.out.println(porcentaje);
				montofinal = (monto + porcentaje);
				System.out.println("El monto final de " + nombre + " es de " + montofinal);
				break;
				
			case 5:
				System.out.println("Introducir nombre del postulante:");
				nombre = leer.next();
				System.out.println(nombre + " Contabilidad");
				matricula = 310;
				mensualidad = 460;
				System.out.println(matricula);
				System.out.println(mensualidad);
				monto = (matricula + mensualidad);
				porcentaje = ((monto * 18) / 100);
				System.out.println(porcentaje);
				montofinal = (monto + porcentaje);
				System.out.println("El monto final de " + nombre + " es de " + montofinal);
				break;
				
			case 6:
				System.out.println("Introducir nombre del postulante:");
				nombre = leer.next();
				System.out.println(nombre + " Administracion ");
				matricula = 310;
				mensualidad = 460;
				System.out.println(matricula);
				System.out.println(mensualidad);
				monto = (matricula + mensualidad);
				porcentaje = ((monto * 18) / 100);
				System.out.println(porcentaje);
				montofinal = (monto + porcentaje);
				System.out.println("El monto final de " + nombre + " es de " + montofinal);
				break;
			
			case 0:
				System.out.println("Saliendo del programa");
				System.out.println("************************");
				break;
				
				default:
					System.out.println("Opcion no valida");
					break;
					
			}
		leer.close();

	}

  }
}