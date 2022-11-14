package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		double precioarticulo;
		double precioventa;
		
		// TODO Auto-generated method stub
		
      Scanner leer = new Scanner(System.in);
      System.out.println("Introducir precioarticulo ");
      precioarticulo = leer.nextInt();
      
      System.out.println("Introducir precioventa ");
      precioventa = leer.nextInt();
      
      double porcentajedescuento;
      porcentajedescuento = (100 - ( precioventa * 100 ) / precioarticulo);
      
      System.out.println("El porcentaje es " + porcentajedescuento);
      
      leer.close();
      
      
      
	}

}
