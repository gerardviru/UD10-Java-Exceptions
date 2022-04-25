package UD10;

import java.util.Scanner;

public class ContraseñaApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el tamaño del array: ");
		int tamaño = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduce la longitud de la contraseña: ");
		int longitud = sc.nextInt();
		
		// Creamos los diferentes arrays
		char[] array_char = new char[longitud];
		Boolean[] array_boolean = new Boolean[longitud];
		Contraseña[] array_password = new Contraseña[tamaño];

		for (int i = 0; i < array_password.length; i++) {
			array_password[i] = new Contraseña(longitud, array_char);
			array_boolean[i] = array_password[i].esFuerte(array_char);
			System.out.println("Contraseña " + (i + 1) + " " + array_boolean[i]);
			System.out.println("Contraseña: " + array_password[i].toString());
			
		}
		sc.close();

	}
}


