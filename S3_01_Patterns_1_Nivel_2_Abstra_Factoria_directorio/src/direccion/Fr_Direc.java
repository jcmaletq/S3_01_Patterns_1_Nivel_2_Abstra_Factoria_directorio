package direccion;
import javax.swing.JOptionPane;

public class Fr_Direc implements Int_Direccion {
	private String pais;
	private String region_metropolitana;
//	private String region_ultramar;
	private String departamento;
	private String distrito;
	private String comuna;
	private String Codigo_Postal;
	private String calle;
	private String numero;
	private String piso;
	public Fr_Direc() {
		pais = "Francia";
		region_metropolitana = JOptionPane.showInputDialog ("Introduce la Region Metropolitana", "Occitania");
		departamento = JOptionPane.showInputDialog ("Introduce el Departamento","11 Aude" );
		distrito = JOptionPane.showInputDialog ("Introduce el Distrito","Carcassonne");
		comuna = JOptionPane.showInputDialog ("Introduce la Comuna","Carcassonne");
		Codigo_Postal = JOptionPane.showInputDialog ("Introduce el Codigo Postal","11000");
		calle = JOptionPane.showInputDialog ("Introduce la Calle","Rue Raymond Roger Trencavel");
		numero = JOptionPane.showInputDialog ("Introduce el numero","3");
		piso = JOptionPane.showInputDialog ("Introduce el piso","A");	
	}
	@Override
	public void listar_direccion() {
		System.out.print("Pais: "+ pais);
		System.out.print(" Region Metropolitana: "+ region_metropolitana);
		System.out.println(" Departamento: " +departamento);
		System.out.print("Distrito: "+ distrito);
		System.out.print(" Comuna: "+ comuna);
		System.out.println(" Codigo Postal: "+ Codigo_Postal);
		System.out.print("Calle: "+ calle);
		System.out.print(" Numero: "+ numero);
		System.out.println(" Piso: "+ piso);
	}
	@Override
	public String toString() {
		return " pais=" + pais + ", region_metropolitana=" + region_metropolitana + ", departamento="
				+ departamento + ", distrito=" + distrito + ", comuna=" + comuna + ", Codigo_Postal=" + Codigo_Postal
				+ ", calle=" + calle + ", numero=" + numero + ", piso=" + piso ;
	}

}
