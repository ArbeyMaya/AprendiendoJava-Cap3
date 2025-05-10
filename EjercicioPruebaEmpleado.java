
public class EjercicioPruebaEmpleado 
{
	public static void main (String [] args)
	{

		EjercicioEmpleado empleado = new EjercicioEmpleado("Arbey","Maya", 1000000);
		double salarioAnual = empleado.salarioAnual();
		double aumento1 = salarioAnual * 0.10;
		
		
		
		System.out.printf("Nombre: %s%n", empleado.obtenerNombre());
		System.out.printf("Apellido: %s%n", empleado.obtenerApellido());
		System.out.printf("Salario Mensual: $%.1f%n", empleado.obtenerSalario());
		System.out.print("mas el 10%: " + aumento1);
	}
}
