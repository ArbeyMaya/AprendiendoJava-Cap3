//Cree una clase llamada Empleado, que incluya tres variables de instancia: un primer
//nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double). Su clase debe tener un constructor
//que inicialice las tres variables de instancia. Proporcione un método establecer y un método obtener para cada
//variable de instancia. Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba
//llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el
//salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual
//de cada Empleado otra vez.

public class EjercicioEmpleado 
{
	//variables de instancia
	private String nombreEmpleado; 
	private String apellidoEmpleado;
	private double salarioMensual;
	
	//constructor de inicializacion 
	public EjercicioEmpleado (String nombreEmpleado, String apellidoEmpleado, double salarioMensual)
	{
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		
		if (salarioMensual > 0.0)
			this.salarioMensual = salarioMensual;
	}
	
	//ESTABLECER
	//metodo establecerNombre
	public void establecerNombre(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}
	
	//metodo establecerApellido
	public void establecerApellido(String apellidoEmpleado)
	{
		this.apellidoEmpleado = apellidoEmpleado;
	}
	
	//metodo establecerSalarioMensual
	public void establecerSalario(double salarioMensual)
	{
		this.salarioMensual = salarioMensual;
	}
	
	//OBTENER
	//metodo obtener nombre
	public String obtenerNombre ()
	{
		return nombreEmpleado;
	}
	
	//metodo obtener apellido
	public String obtenerApellido()
	{
		return apellidoEmpleado;
	}
	
	//metodo obtener salario
	public double obtenerSalario()
	{
		return salarioMensual;
	}
	
	
	public double salarioAnual ()
	{
		return salarioMensual * 12;
	}
	
	
}
