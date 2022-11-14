package Ejercicio05_substring;

public class Ejercicio05_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String cadena="ZYWXVUTSRQPONMLKJIHGFEDCBA";
		
		System.out.println(cadena);
		
		System.out.println("Tamaño de la variable cadena: "+cadena.length());
		//Nos devuelve el tamaño de la variable llamada cadena.
		
		System.out.println("Muestro los caracteres comprendidos entre el numero 5 y el 20: "+ cadena.substring(4, 20));
		//VUTSRQPONMLKJIHG
		
		System.out.println();
		
		for(int i=0;i<cadena.length();i++) 
		{
			System.out.println(cadena.substring(i, cadena.length()));
	//Muestra la cadena comprendida entre el primer valor y el segundo valor.
		}

	}

	}

// .length indica el tamaño de la cadena.
// .substring muestra la cadena de una posicion (x) a una posicion (y).
