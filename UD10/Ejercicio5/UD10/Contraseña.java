package UD10;

public class Contraseña {

	// Constantes
		final private int LONGITUD = 8;

		// Atributos
		private int longitud;
		private String contraseña;

		// Constructor default
		public Contraseña() {
			this.longitud = LONGITUD;
			this.contraseña = "";
		}

		// Constructor creando la password aleatoria con la longitud indicada.
		public Contraseña(int longitud, char[] array_c) {
			this.longitud = longitud;
			this.contraseña = passwordAleatorio(longitud, array_c);
		}

		/* Función para generar una contraseña aleatoria con la longitud */
		public String passwordAleatorio(int longitud, char[] array_c) {

			String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			String contra = "";
			String character = "";
			char c;

			for (int i = 0; i < longitud; i++) {
				c = banco.charAt((int) (Math.random() * 62));
				character = "" + c;
				contra += character;
				array_c[i] = c;
			}

			return contra;
		}
		
		/* Metodo para verificar si una password es fuerte o no */
		public boolean esFuerte(char[] array_c) {

			int cont_mayus = 0;
			int cont_minus = 0;
			int cont_num = 0;

			for (int i = 0; i < array_c.length; i++) {
				Character a = array_c[i];
				if (a >= 48 && a <= 57) {
					cont_num++;
				} else if (a == Character.toLowerCase(a)) {
					cont_minus++;
				} else {
					cont_mayus++;
				}
			}

			if (cont_mayus > 5 && cont_minus > 1 && cont_num > 5) {
				return true;
			} else {
				return false;
			}

		}
		
		// Getters i Setters
		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		@Override
		public String toString() {
			return "Password [longitud = " + longitud + ", contraseña = " + contraseña + "]";
		}
}
