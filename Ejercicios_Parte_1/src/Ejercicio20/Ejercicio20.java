package Ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		int nota=leer.nextInt();
		leer.close();
		
		if ((nota >= 0)&&(nota <= 10))
		{
			switch (nota)
			{
		case 0:// Si nota es == 0
		case 1:
		case 2:
			System.out.println("Muy Deficiente");
			break;// Romper la ejecución
			
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
			
		case 5:
			System.out.println("Suficiente");
			break;
			
		case 6:
			System.out.println("Bien");
			break;
			
		case 7:
		case 8:
			System.out.println("Notable");
			break;
			
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
			
		default:
			System.err.println("Nota no valida");
			break;
	}


	}
}
}

