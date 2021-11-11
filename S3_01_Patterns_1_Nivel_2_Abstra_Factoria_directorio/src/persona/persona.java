package persona;
import javax.swing.JOptionPane;
public class persona {
	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail ;
	}
	private String nombre;
	private String apellido;
	private String mail;
	private String coment;
  public persona (String nacio) {
		
		nombre = JOptionPane.showInputDialog ("Introduce el Nombre " +nacio + " : ","Nombre");
		apellido = JOptionPane.showInputDialog ("Introduce el Apellido "+nacio + " : ","Appellido");
		mail = JOptionPane.showInputDialog ("Introduce el mail","nombre.apellido@gmail.com");
//		comment = JOptionPane.showInputDialog ("Introduce Comentario","comm");
  }
  	public void listar_persona() {
  	
		System.out.print("Nombre: "+ nombre);
		System.out.print(" Apellido: "+ apellido);
		System.out.println(" Mail: "+ mail);

	}
}