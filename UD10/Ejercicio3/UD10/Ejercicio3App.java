package UD10;

import UD10.Ejercicio3numAleatorio;

public class Ejercicio3App {

	public static void main(String[] args) throws Ejercicio3numAleatorio {
		
		try {
			System.out.println("Generamos un número aleatorio");
			Ejercicio3numAleatorio num_Aleatorio1 = new Ejercicio3numAleatorio();
			System.out.println("El numero aleatorio generado es: "+num_Aleatorio1.getNumAleatorio());
			{
				throw new Ejercicio3numAleatorio(num_Aleatorio1.getNumAleatorio());
			}
			}catch (Ejercicio3numAleatorio e) {
				System.out.println(e.getMensaje());
			}
	}

}
