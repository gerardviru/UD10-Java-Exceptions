package UD10;

public class mainApp{
	
	public static void main(String[] args) {
		
		//Instanciamos un objeto de la clase usuario y creamos un número aleatorio con el rango máximo definido
		//en la clase
		Usuario usuario = new Usuario();
		int num=(int) Math.round((Math.random()*Usuario.max));
		
		System.out.println("Intenta adivinar un número del 1 al " + Usuario.max);
		//Llamamos al método de la clase usuario que llama al usuario para que intente adivinar el número
		usuario.adivinar(num);
		
	}	
}
