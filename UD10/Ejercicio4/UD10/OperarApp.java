package UD10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperarApp {

	public static void main(String[] args) {
		
	// Declaracion de variables
			Scanner sc = new Scanner(System.in);
			int num_1 = 0;
			int num_2 = 0;
			int operacion = 0;
			int num;

			do {

				try {

					System.out.println(
							"Si quieres realizar las operaraciones basicas, introduce el numero '1', sino el '2' para las operaciones avanzadas ");
					operacion = sc.nextInt();
					sc.nextLine();

				} catch (InputMismatchException e) {
					System.out.println("No se ha introducido una opción valida.");
					sc.nextLine();
				}

			} while (operacion != 1 && operacion != 2);

			switch (operacion) {

			case 1:

				try {

					System.out.println("Introduce el primer valor: ");
					num_1 = sc.nextInt();
					System.out.println("Introduce el segundo valor: ");
					num_2 = sc.nextInt();
						
					// Creamos el primer objeto
					Ejercicio4Operar op1 = new Ejercicio4Operar(num_1, num_2);
						
					// Operaciones con los dos parametros
					op1.suma();
					op1.resta();
					op1.multiplicacion();
					op1.division();

				} catch (ArithmeticException e) {
					System.out.println("Arithmetic exception: "+e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println(
							"No se ha introducido una opción valida.");
				}

				break;
			case 2:

				try {
					System.out.println("Introduce el valor del número: ");
					num = sc.nextInt();
						
					// Creamos el segundo objeto
					Ejercicio4Operar op2 = new Ejercicio4Operar(num);
						
					// Hacemos las operaciones con el valor introducido.
					op2.raizCuadrada();
					op2.raizCubica();
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic exception: "+e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println(
							"No se ha introducido una opción valida.");
				}

				break;

			}

		sc.close();

	}
}
