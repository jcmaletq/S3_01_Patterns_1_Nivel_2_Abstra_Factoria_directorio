package telefono;
import javax.swing.JOptionPane;
public class Fr_Telef implements Int_Telefonos {

		@Override
	public String toString() {
		return " prefix=" + prefix + ", numero=" + numero ;
	}

		private String prefix;
		private String numero;
	public Fr_Telef() {	
		prefix = "+33 ";
		numero = JOptionPane.showInputDialog ("Introduce el telefono","xx");
}
	
	@Override
	public void listar_telefono() {
		System.out.println(" Numero: "+prefix + numero);
	}

}
