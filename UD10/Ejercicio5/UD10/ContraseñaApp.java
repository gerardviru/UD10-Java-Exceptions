package UD10;

import java.util.Scanner;

public class Contrase�aApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el tama�o del array: ");
		int tama�o = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduce la longitud de la contrase�a: ");
		int longitud = sc.nextInt();
		
		// Creamos los diferentes arrays
		char[] array_char = new char[longitud];
		Boolean[] array_boolean = new Boolean[longitud];
		Contrase�a[] array_password = new Contrase�a[tama�o];

		for (int i = 0; i < array_password.length; i++) {
			array_password[i] = new Contrase�a(longitud, array_char);
			array_boolean[i] = array_password[i].esFuerte(array_char);
			System.out.println("Contrase�a " + (i + 1) + " " + array_boolean[i]);
			System.out.println("Contrase�a: " + array_password[i].toString());
			
		}
		sc.close();

	}
}


