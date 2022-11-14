package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int producto;
		int metros;
	     metros = 1852;
		// TODO Auto-generated method stub
	    int millasmarinas;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introducir millasmarinas ");
		millasmarinas = leer.nextInt();
		
	   producto = millasmarinas * metros;
	    System.out.println("Los metros son " + producto );
		
		leer.close();
		
	}

}
