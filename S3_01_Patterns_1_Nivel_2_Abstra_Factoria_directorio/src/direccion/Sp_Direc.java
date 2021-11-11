package direccion;
import javax.swing.JOptionPane;
public class Sp_Direc implements Int_Direccion {
	@Override
	public String toString() {
		return " pais=" + pais + ", autonomia=" + autonomia + ", provincia=" + provincia + ", comarca="
				+ comarca + ", municipio=" + municipio + ", Codigo_Postal=" + Codigo_Postal + ", calle=" + calle
				+ ", numero=" + numero + ", piso=" + piso  ;
	}
	private String pais;
	private String autonomia;
//	private String foral;
//	private String ciudades_autonoma;
	private String provincia;
	private String comarca;
	private String municipio;
	private String Codigo_Postal;
	private String calle;
	private String numero;
	private String piso;
  public Sp_Direc () {
		pais = "España";
		autonomia = JOptionPane.showInputDialog ("Introduce la Autonomia","Catalunya");
		provincia = JOptionPane.showInputDialog ("Introduce la Provincia","Barcelona");
		comarca = JOptionPane.showInputDialog ("Introduce la Comarca","Barcelones");
		municipio = JOptionPane.showInputDialog ("Introduce la Municipio","Barcelona");
		Codigo_Postal = JOptionPane.showInputDialog ("Introduce el Codigo Postal","08024");
		calle = JOptionPane.showInputDialog ("Introduce la Calle","Sardenya");
		numero = JOptionPane.showInputDialog ("Introduce el numero","xx");
		piso = JOptionPane.showInputDialog ("Introduce el piso","22");
  }
	@Override
	public void listar_direccion() {
		System.out.print("Pais: "+ pais);
		System.out.print(" Autonomia: "+ autonomia);
		System.out.println(" Provincia: "+ provincia);
		System.out.print("Comarca: "+ comarca);
		System.out.print(" Municipio: "+ municipio);
		System.out.println(" Codigo Postal: "+ Codigo_Postal);
		System.out.print("Calle: "+ calle);
		System.out.print(" Numero: "+ numero);
		System.out.println(" Piso: "+ piso);
	}

}
