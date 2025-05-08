//fig. 3.8: Cuenta.java
// La clase Cuenta con una variable de instancia double llamada saldo y un constructor
// además de un método llamado deposito que realiza validación.

public class Cuenta 
{
	private String nombre; //variable de instancia
	private double saldo; //variable de instancia
	
	//el contructor Cuenta que recibe dos parametros
	public Cuenta (String nombre, double saldo)
	{
		this.nombre = nombre;//asigna nombre a la variable de instancia nombre
		
		// valida que el saldo sea mayor que 0.0; de lo contrario,
		// la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
		if  (saldo > 0.0)//si el saldo es valido
			this.saldo = saldo; //lo asigna a la variable de instancia saldo
	}
	
	// método que deposita (suma) sólo una cantidad válida al saldo
	public void depositar(double montoDeposito)
	{
		if(montoDeposito > 0.0) //Si el monto deposito es valido
			
			if( montoDeposito <= saldo) {
				saldo = saldo - montoDeposito;//lo suma al saldo
			}
			else {
                System.out.println("No puedes retirar más de lo que tienes. Saldo disponible: " + saldo);
			}

			
	}
	
	// método que devuelve el saldo de la cuenta
	public double obtenerSaldo()
	{
		return saldo;
	}
	
	//metodo para establecer el nombre del objeto\
	public void establecerNombre(String nombre) 
	{
		this.nombre = nombre;//almacenar nombre
	}
	
	public String obtenerNombre()
	{
		return nombre;//devuelve el valor de  nombre a quien lo invoco
	}

}//fin de la clase Cuenta