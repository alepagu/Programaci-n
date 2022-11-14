package Ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		int horas;
		int minutos;
		int segundos;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir hora menor o igual a 23:");
		horas = leer.nextInt();
		System.out.println("introcir minutos menor o igual a 59 :");
		minutos = leer.nextInt();
		System.out.println("Introducir segundos menor o igual a 59:");
		segundos = leer.nextInt();
		leer.close();
		
	 if ((segundos == 59) && (minutos == 59)&&(horas < 23))
		{
			segundos = 00;
			minutos = 00;
			horas = horas + 1;
			System.out.println(horas + ":" + minutos + ":" + segundos);
		}
	 
	 else if ((segundos == 59) && (minutos == 59)&&(horas == 23))
	 {
			segundos = 00;
			minutos = 00;
			horas = 00;
			System.out.println(horas + ":" + minutos + ":" + segundos); 
	 }
	 
	 else if ((segundos == 59) && (minutos < 59 ) && (horas <= 23))
	 {
		 segundos = 00;
		 minutos = minutos + 1;
		 System.out.println(horas + ":" + minutos + ":" + segundos);
	 }
	
		else if ((segundos < 59) && (minutos > 59)&&(horas > 23))
		{
			System.out.println("Hora introducida no valida");
		}
		
		else if ((segundos > 59) && (minutos < 59)&&(horas > 23))
		{
			System.out.println("Hora introducida no valida");
		}
		
		else if ((segundos > 59) && (minutos < 59)&&(horas < 23))
		{
			System.out.println("Hora introducida no valida");
		}
		
		 else if ((segundos < 59) && (minutos < 59)&&(horas > 23))
		{
			System.out.println("Hora introducida no valida");
		}
	 
		 else if ((segundos > 59) && (minutos < 59)&&(horas < 23))
		 {
			 System.out.println("Hora introducida no valida");
		 }
	 
		else
		{
			
		}

	}

}
