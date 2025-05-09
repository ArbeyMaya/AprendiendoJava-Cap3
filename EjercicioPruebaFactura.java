
public class EjercicioPruebaFactura 
{
	public static void main (String[] args)
	{
		EjercicioFactura factura1 = new EjercicioFactura("001", "Martillo", 5, 50000);
		
		System.out.println("\tFactura");
		System.out.printf("# Codigo : %s %n", factura1.obtenerNumeroPieza());
		System.out.printf("# Articulo: %s %n", factura1.obtenerDescripcionPieza());
		System.out.printf("# Cantidad: %d %n", factura1.obtenerCantidadArticulos());
		System.out.printf("# Precio: $%.2f %n", factura1.obtenerPrecioArticulos());
		System.out.printf("# Total: $%.2f%n", factura1.obtenerMontoFactura());
	}
}
