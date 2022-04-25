package UD10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Usuario {

	static final int max = 500;

	// Método para input del número que introduce el usuario
	public void adivinar(int num) {

		try {

			System.out.println("Introduce un número: ");
			Scanner teclado = new Scanner(System.in);
			String numInput = teclado.next();
			int input = Integer.parseInt(numInput);
			if (num == input) {
				System.out.println("Correcto, el número a adivinar era: " + num);
			} else if (num < input) {
				System.out.println("Lo siento, el numero buscado es menor que " + input + " Fallaste!!");
			} else {
				System.out.println("Lo siento, el numero buscado es mayor que " + input + " Fallaste!!");
			}

			adivinar(num);
		} 
		catch (InputMismatchException e) {
			System.out.println("Atención, asegúrese de ingresar un número entero!!" + "ERROR!!!");
			
			adivinar(num);	
		}
	}
}
