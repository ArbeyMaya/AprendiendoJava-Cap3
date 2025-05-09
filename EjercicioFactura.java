
public class EjercicioFactura 
{
	//variables de instancia
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidadArticulos;
	private double precioArticulos;
	
	//constructor
	public EjercicioFactura (String numeroPieza, String descripcionPieza, int cantidadArticulos, double precioArticulos)
	{
		this.numeroPieza = numeroPieza;
		this.descripcionPieza = descripcionPieza;
		
		if (cantidadArticulos > 0)
			this.cantidadArticulos = cantidadArticulos;
		
		if (precioArticulos > 0.0)
			this.precioArticulos = precioArticulos;
		
	}
	

	
	//metodos establecer

	
	public void establecerNumeroPieza (String numeroPieza)
	{
		this.numeroPieza = numeroPieza;
	}
	
	public void establecerDescripcionPieza (String descripcionPieza)
	{
		this.descripcionPieza = descripcionPieza;
	}
	
	public void cantidadArticulos (int cantidadArticulos)
	{
		this.cantidadArticulos = cantidadArticulos;
	}
	
	public void precioArticulos (double precioArticulos)
	{
		this.precioArticulos = precioArticulos;
	}
	
	//metodos obtener
	public String obtenerNumeroPieza()
	{
		return numeroPieza;
	}
	
	public String obtenerDescripcionPieza()
	{
		return descripcionPieza;
	}
	
	public int obtenerCantidadArticulos()
	{
		return cantidadArticulos;
	}
	
	public double obtenerPrecioArticulos()
	{
		return precioArticulos;
	}
	
	public double obtenerMontoFactura()
	{
		return cantidadArticulos * precioArticulos;
	}
	

}
