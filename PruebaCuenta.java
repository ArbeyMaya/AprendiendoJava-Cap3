// Fig. 3.9: PruebaCuenta.java
// Entrada y salida de números de punto flotante con objetos Cuenta.
import java.util.Scanner;

public class PruebaCuenta 
{
	public static void main(String [] args)
	{
		Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
		Cuenta cuenta2 = new Cuenta("John Blue", 7.53);
		
		//muestra el saldo inicial de cada objeto 
		System.out.printf("Saldo de %s: $%.2f%n", 
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n%n", 
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		
		// crea un objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba el monto a retirar para cuenta1"); // indicador (promt)
		double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
		System.out.printf("%nRestando %.2f al saldo de cuenta1%n%n",
				montoDeposito);
		cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1
		
		//muestra los saldos
		System.out.printf("Saldo de %s: $%.2f%n",
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("saldo de %s: $%.2f%n%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		
		System.out.println("Escriba el monto a retirar para la cuenta2");
		montoDeposito = entrada.nextDouble(); //obtiene entrada del usuario
		System.out.printf("%nrestando %.2f al saldo de cuenta%n%n",
				montoDeposito);
		cuenta2.depositar(montoDeposito);//Suma al saldo de cuenta2
		
		//muestra los saldos
		System.out.printf("Saldo de %s: $%.2f%n", 
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());

		System.out.printf("Saldo de %s: $%.2f%n%n", 
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

	}
}//Fin de la clase PruebaCuenta