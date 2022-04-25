package UD10;

public class Contrase�a {

	// Constantes
		final private int LONGITUD = 8;

		// Atributos
		private int longitud;
		private String contrase�a;

		// Constructor default
		public Contrase�a() {
			this.longitud = LONGITUD;
			this.contrase�a = "";
		}

		// Constructor creando la password aleatoria con la longitud indicada.
		public Contrase�a(int longitud, char[] array_c) {
			this.longitud = longitud;
			this.contrase�a = passwordAleatorio(longitud, array_c);
		}

		/* Funci�n para generar una contrase�a aleatoria con la longitud */
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

		public String getContrase�a() {
			return contrase�a;
		}

		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}

		@Override
		public String toString() {
			return "Password [longitud = " + longitud + ", contrase�a = " + contrase�a + "]";
		}
}
