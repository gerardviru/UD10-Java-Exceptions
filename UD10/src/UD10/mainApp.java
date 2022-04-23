package UD10;

public class mainApp{
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		int num=(int) Math.round((Math.random()*Usuario.max));
		
		System.out.println("Intenta adivinar un número del 1 al " + Usuario.max);
		usuario.adivinar(num);
		
	}	
}
