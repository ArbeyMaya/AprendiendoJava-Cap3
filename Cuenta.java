//fig. 3.1: Cuenta.java
//Clase cuenta que contiene una variable de instancia llamada nombre 
//y metodos para establecer y obtener su valor

public class Cuenta 
{
	private String nombre; //variable de instancia
	
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
