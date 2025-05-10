//Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un
//día (tipo int) y un año (tipo int). Su clase debe tener un constructor que inicialice las tres variables de instancia, y
//debe asumir que los valores que se proporcionan son correctos. Proporcione un método establecer y un método obtener
//para cada variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año, separados
//por barras diagonales (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de
//la clase Fecha.

public class EjercicioFecha {
	
	//variables de instancia
	private int mes;
	private int dia;
	private int ano;
	
	//Constructor de inicializacion
	public EjercicioFecha (int mes, int dia, int ano)
	{
		 if (mes > 0 && mes <= 12)
			 this.mes = mes;
		 
		 if (dia > 0 && dia <= 30)
		 {
			 this.dia = dia;
		 }
		 
		 if (ano > 0)
			 this.ano = ano;
	}
	
	//metodo establecer mes
	
	public void establecerMes (int mes)
	{
		this.mes = mes;
	}
	
	//metodo establecer dia
	public void establecerDia (int dia)
	{
		this.dia = dia;
	}
	
	//metodo establecer ano
	public void establecerAno (int ano)
	{
		this.ano = ano;
	}
	
	//metodo obtener mes
	
	public int obtenerMes ()
	{
		return mes;
	}
	
	public int obtenerDia ()
	{
		return dia;
	}
	
	public int obtenerAno ()
	{
		return ano;
	}
	
	//Metodo mostrar fecha
	public void mostrarFecha ()
	{
		 System.out.println(mes + "/" + dia + "/" + ano);
	}
}
