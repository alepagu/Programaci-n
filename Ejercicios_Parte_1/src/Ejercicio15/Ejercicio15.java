package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir el primer numero: ");
		num1 = leer.nextInt();
		System.out.println("Introducir el segundo numero: ");
		num2 = leer.nextInt();
		System.out.println("Introducir el tercer numero: ");
		num3 = leer.nextInt();
		leer.close();
		
		if ((num1 > num2)&&(num1 > num3))
		{
			System.out.println(num1 + " Es mayor");
		}
		
		else if ((num1 > num2)&&(num1 < num3)) 
		{
			System.out.println("Es mayor: " + num3);
			System.out.println("Es menor: " + num2);
		}
		
		else if ((num1 < num2)&&(num1 > num3))
		{
			System.out.println("Es mayor: " + num2);
			System.out.println("Es menor: " + num3);
		}
		
		else if ((num1 < num2)&&(num2 < num3))
		{
			System.out.println("Es mayor: " + num3);
			System.out.println("Es menor: " + num1);
		}
		
		else if ((num1 < num2)&&(num2 > num3))
		{
			System.out.println("Es mayor: " + num2);
			System.out.println("Es menor: " + num1);
		}
		 
		else if ((num1 == num2)&&(num1 > num3))
		{
			System.out.println("Son iguales: " + "num1" + " num2");
			System.out.println("Es menor: " + num3);
		}
		else if ((num1 == num2)&&(num1 < num3))
		{
			System.out.println("Es mayor: " + num3);
			System.out.println("Son iguales: " + "num1" + " num3");
		}
		
		else if ((num1 > num2)&& (num1 == num3))
		{
			System.out.println("Son iguales: " + "num1" + " num3");
			System.out.println("Es menor: " + num2);
		}
		
		else if ((num1 < num2)&& (num1 == num3))
		{
			System.out.println("Es mayor: " + num2);
			System.out.println("Son iguales: " + "num1" + " num3");	
		}
		
		
		else if ((num1 < num2)&&(num2 == num3))
		{
			System.out.println("Son iguales: " + "num2" + " num3");
			System.out.println("Es menor: " + num1);
		}
		
		else if ((num1 > num2)&&(num2 == num3))
		{
			System.out.println("Es mayor: " + num1);
			System.out.println("Son iguales: " + "num2" + " num3");
		}
			
		else
		{
		System.out.println("Todos los numeros son iguales");
		}
		
	}

}
