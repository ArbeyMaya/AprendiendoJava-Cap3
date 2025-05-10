
public class EjercicioPruebaEmpleado 
{
	public static void main (String [] args)
	{

		EjercicioEmpleado empleado = new EjercicioEmpleado("Arbey","Maya", 1000000);
						
		System.out.printf("Nombre: %s%n", empleado.obtenerNombre());
		System.out.printf("Apellido: %s%n", empleado.obtenerApellido());
		System.out.printf("Salario Mensual: $%.1f%n", empleado.obtenerSalario());
		System.out.printf("salario anual: $%.1f%n", empleado.salarioAnual());
	}
}
