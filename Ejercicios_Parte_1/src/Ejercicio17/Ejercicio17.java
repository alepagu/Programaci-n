package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		String nombre = "alejandro";
		String contraseña = "padilla";
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introducir nombre de usuario: ");
		String user = reader.nextLine();
		System.out.println("Introducir contraseña: ");
		String pass = reader.nextLine();
		reader.close();
		
		if ((nombre.contentEquals(user))&&(contraseña.contentEquals(pass)))
		{
			System.out.println("Inicio de sesion correcto");
		}
		
		else if (nombre.contentEquals(user) == false)
		{
			System.out.println("Usuario incorrecto");
		}
		else
		{
			System.out.println("Contraseña incorrecta");
		}

	}

}