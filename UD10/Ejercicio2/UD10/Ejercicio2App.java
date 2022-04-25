package UD10;

//Importamos la clase para lanzar un objeto que contenga la excepción
import UD10.Ejercicio2CustomExceptions;

public class Ejercicio2App  {

	public static void main(String[] args) {
		String mensaje = "Linea de texto como ejemplo, imprimida por pantalla";

		try {
			System.out.println("¿Hola, como estas?");
			{
				throw new Ejercicio2CustomExceptions(mensaje);
			}
		} catch (Ejercicio2CustomExceptions e) {
			System.out.println(e);
			System.out.println("Fin de ejecución");
		}

	}

}


