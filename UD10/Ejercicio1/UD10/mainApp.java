package UD10;

public class mainApp{
	
	public static void main(String[] args) {
		
		//Instanciamos un objeto de la clase usuario y creamos un n�mero aleatorio con el rango m�ximo definido
		//en la clase
		Usuario usuario = new Usuario();
		int num=(int) Math.round((Math.random()*Usuario.max));
		
		System.out.println("Intenta adivinar un n�mero del 1 al " + Usuario.max);
		//Llamamos al m�todo de la clase usuario que llama al usuario para que intente adivinar el n�mero
		usuario.adivinar(num);
		
	}	
}
