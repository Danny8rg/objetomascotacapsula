import javax.swing.JOptionPane;

public class Mascota {
	int edad, codigo;
	String nombre, especie;
	public void IngresarDatos () {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("inserte el codigo del animal"));
		nombre = JOptionPane.showInputDialog("inserte el nombre de la mascota");
		especie = JOptionPane.showInputDialog("inserte la especie de su animal");
		edad = Integer.parseInt(JOptionPane.showInputDialog("inserte la edad del animal"));
	}
	
	public void GuardarDatos (int codigo, String nombre, String especie, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.codigo = codigo;
		this.edad = edad;
	}
}
