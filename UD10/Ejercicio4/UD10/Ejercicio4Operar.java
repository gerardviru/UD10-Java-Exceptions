package UD10;

public class Ejercicio4Operar {

	private int numero1;
	private int numero2;
	private int numero;

	// Constructor para realizar la raiz cuadrada y cubica
	public Ejercicio4Operar(int numero) {
		this.numero = numero;
	}

	// Constructor para el resto de operaciones con dos parametros
	public Ejercicio4Operar(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Creamos los diferentes metodos con las operaciones desadas
	public void suma() {

		System.out.println("Suma: " + (numero1 + numero2));

	}

	public void resta() {

		System.out.println("Resta: " + (numero1 - numero2));

	}

	public void multiplicacion() {

		System.out.println("Multiplicacion: " + (numero1 * numero2));

	}

	public void potencia() {

		System.out.println(
				"Potencia: " + (Math.pow(numero1, numero2)) + ". Base: " + numero1 + " y exponente: " + numero2);

	}

	public void division() {

		System.out.println("Divisi�n: " + (numero1 / numero2));

	}

	public void raizCuadrada() {

		System.out.println("Ra�z cuadrada: " + (Math.sqrt(numero)));

	}

	public void raizCubica() {

		System.out.println("Ra�z c�bica: " + (Math.cbrt(numero)));
	}
}

