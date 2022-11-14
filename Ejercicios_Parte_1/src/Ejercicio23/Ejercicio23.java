package Ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		int compra;
		int descuento1;
		int descuento2;
		int opcion = 1;
		
		
		
				
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println(" ****************** ");
		System.out.println("Aplicacion Farmacia Bienvenido ");
		System.out.println("Si desea salir - opcion0 ");
		System.out.println("Si el pago se realiza en efectivo - opcion1 ");
		System.out.println("Si el pago se reaiza con tarjeta - opcion2 ");
		System.out.println("Salir de applicacion ");
		System.out.println("Entre en la opcion deseada: ");
        opcion = leer.nextInt();
        
        if (opcion != 0)
        {
        	switch (opcion)
        	{
        	case 1:
        		System.out.println("Inserte valor de la compra: ");
        		compra = leer.nextInt();
        		descuento1 = (compra * 5) / 100;
        		compra = (compra - descuento1 ) ;
        		System.out.println("Tu compra es: " + compra);
        		break;
        		
        	case 2:
        		System.out.println("Inserte valor de la compra: ");
        		compra = leer.nextInt();
        		descuento2 = (compra * 3) / 100;
        		compra = (compra + descuento2 ) ;
        		System.out.println("Tu compra es: " + compra);
        		break;
        		
        	case 0:
               System.out.println("Saliendo de applicacion");
               break;
           
               default:
            	   System.out.println("Opcion no valida");
            	   break;
        	}
        	leer.close();
        }
	}

}
