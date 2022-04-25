package UD10;

public class Ejercicio3numAleatorio extends Exception {

	private final int RangoMenor = 0;
	private final int RangoMayor = 999;
	
	
	private int numeroAleatorio;
	
	// Constructor por defecto
	public Ejercicio3numAleatorio() {
		this.numeroAleatorio = numAleatorio(RangoMenor, RangoMayor);
	}
	
	public Ejercicio3numAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}
	
	// Metodo para generar el número aleatorio
	private int numAleatorio(int menor, int mayor) {
		return (int) (Math.random() * (mayor- menor)) + menor;
	}

	public int getNumAleatorio() {
		return numeroAleatorio;
	}
	
	public String getMensaje() {

		if (this.numeroAleatorio % 2 == 0) {
			return "Es par";
		} else {
			return "Es impar";
		}

	}

}
