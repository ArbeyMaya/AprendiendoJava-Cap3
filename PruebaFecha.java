
public class PruebaFecha 
{
	public static void main (String [] args)
	{
		EjercicioFecha fecha1 = new EjercicioFecha(11, 23, 2000);
		EjercicioFecha fecha2 = new EjercicioFecha(9, 29, 2023);
		
		System.out.print("fecha: " );
		fecha1.mostrarFecha();
		
		System.out.print("fecha: ");
		fecha2.mostrarFecha();
	}
}
