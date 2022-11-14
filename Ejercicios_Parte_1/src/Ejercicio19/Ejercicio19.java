package Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
	int opcion=1;
        int saldo=1000;
        int dinero;
        
		// TODO Auto-generated method stub
        
        Scanner leer = new Scanner (System.in);
        
     System.out.println("*************************"); 
        System.out.println("Menu de la aplicación - CAJERO"); 
        System.out.println("1.-Sacar Dinero"); 
        System.out.println("2.-Ingresar Dinero"); 
        System.out.println("0.-Salir del Cajero"); 
        System.out.println("SALDO DISPONIBLE: " + saldo); 
        System.out.println("Introducir opción de cajero");
        opcion = leer.nextInt(); 
        System.out.println(""); 

           if (saldo != 0)
           {
            switch (opcion)
            {
                case 1:
                    System.out.print("Insertar Saldo a Sacar:"); 
                    dinero = leer.nextInt(); 
                    if (dinero <= saldo)
                    {
                        saldo = saldo-dinero;
                        System.out.println("Tu saldo ahora es: " + saldo);
                    }
                    else
                    {
                    	System.out.println(""); 
                        System.out.println("No tienes saldo suficiente");
                    }
                    break;
            
                case 2:
                    System.out.print("Insertar Saldo a Ingresar:"); 
                    dinero = leer.nextInt(); 
                    if (dinero >= saldo)
                    {
                    saldo = saldo + dinero;
                    System.out.println("Tu saldo actual es: " + saldo);
                    }
                    
                    else 
                    {
                    	saldo = saldo + dinero;
                        System.out.println("Tu saldo actual es: " + saldo);
                    }
                    
                    break;
            
                case 0:
                    System.out.print("Saliendo del cajero");
                    break;
                    
                default:
                    System.out.println("Opción NO valida"); 
                    break; 
            
            }
            
            leer.close();
      }
   }
}



           
