package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
	int pi;
	pi = (int) 3.14;
	
	int radio;
	Scanner leer = new Scanner(System.in);
	System.out.println("Introducir radio ");
	radio = leer.nextInt();
	
	int longitud;
	longitud = radio;
	int Longitud;
	Longitud = pi * (radio * 2);
	double area;
	area = pi * Math.pow(radio, 2);
	double volumen;
	volumen = (4/3) * Math.pow(radio, 2) * pi;
	;
	
	System.out.println("longitud es = " + longitud);
	System.out.println(" Longitud es = " + Longitud);
	System.out.println("area es = " + area);
	System.out.println("volumen es = " + volumen);
	
	leer.close();

	}

}
