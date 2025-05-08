// Fig. 3.13: DialogoNombre.java
// Entrada básica con un cuadro de diálogo.
import javax.swing.JOptionPane;

public class DialogoNombre 
{
	public static void main(String [] args)
	{
		//Pide al usuario que escriba su nombre
		String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
		
		//Crea el mensaje
		String mensaje =
				String.format("Bienvenido, %s, a la programacion en java!", nombre);
		
		//muestra el mensaje para dar la bienbenida al usuario por su nombre
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
