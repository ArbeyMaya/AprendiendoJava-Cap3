//fig. 3.2: PruebaCuenta.java
//crear y manipular un objeto Cuenta
import java.util.Scanner;

public class PruebaCuenta 
{
	public static void main(String [] args)
	{
		//Crea un objeto Scanner para obtener la entrada desde el simbolo del sistema 
		Scanner entrada = new Scanner(System.in);
		
		//Crea un objeto cuenta y lo asigna a miCuenta
		Cuenta miCuenta = new Cuenta();
		
		//muestra el valor inicial del nombre (null)
		System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
		
		//pide y lee el nombre
		System.out.println("Introduzca el nombre:");
		String elNombre = entrada.nextLine();//lee una linea de texto
		miCuenta.establecerNombre(elNombre);//coloca el nombre n mi cuenta
		System.out.println();//Imprime una linea en blanco
		
		//Muestra el nombre almacenado en el objeto miCuenta
		System.out.printf("El nombre en el objeto miCueta es: %n%S%n", 
				miCuenta.obtenerNombre());
	}
}//Fin de la clase PruebaCuenta
