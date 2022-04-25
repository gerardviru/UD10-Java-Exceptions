package UD10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Usuario {

	static final int max = 500;

	// M�todo para input del n�mero que introduce el usuario
	public void adivinar(int num) {

		try {

			System.out.println("Introduce un n�mero: ");
			Scanner teclado = new Scanner(System.in);
			String numInput = teclado.next();
			int input = Integer.parseInt(numInput);
			if (num == input) {
				System.out.println("Correcto, el n�mero a adivinar era: " + num);
			} else if (num < input) {
				System.out.println("Lo siento, el numero buscado es menor que " + input + " Fallaste!!");
			} else {
				System.out.println("Lo siento, el numero buscado es mayor que " + input + " Fallaste!!");
			}

			adivinar(num);
		} 
		catch (InputMismatchException e) {
			System.out.println("Atenci�n, aseg�rese de ingresar un n�mero entero!!" + "ERROR!!!");
			
			adivinar(num);	
		}
	}
}
