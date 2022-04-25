package UD10;

//Clase para crear excepciones personalizadas propias

public class Ejercicio2CustomExceptions extends Exception {

	private String mensaje;

	public Ejercicio2CustomExceptions(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return mensaje;
	}
}
