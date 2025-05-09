
//(La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar para representar una
//factura para un artículo vendido en la tienda. Una Factura debe incluir cuatro piezas de información como variables
//de instancia: un número de pieza (tipo String), la descripción de la pieza (tipo String), la cantidad de artículos de ese
//tipo que se van a comprar (tipo int) y el precio por artículo (double). Su clase debe tener un constructor que inicialice
//las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de
//instancia. Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura (es
//decir, que multiplique la cantidad de artículos por el precio de cada uno) y después devuelva ese monto como un valor
//double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse
//en 0.0. Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.

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
