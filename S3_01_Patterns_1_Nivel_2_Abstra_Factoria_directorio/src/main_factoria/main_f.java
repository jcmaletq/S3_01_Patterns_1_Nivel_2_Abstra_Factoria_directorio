package main_factoria;
import app.*;
import direccion.*;
import telefono.*;
import persona.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.vehicles.project.Person;

import Factorias.*;

public class main_f {

    protected static List<String> lista_pe = new ArrayList<>();
	private static Aplicacion main_f() {
		Aplicacion apl = null;
		Directorio_Factoria factoria;
		String pais = null;
			pais = JOptionPane.showInputDialog("introudce el pais de la direccion o 'n' para salir","España").toLowerCase();
			if (pais.contains("españa")){
				persona per = new persona("Español");
				per.listar_persona();
				factoria = new Sp_Factoria();
				apl = new Aplicacion(factoria);
				lista_pe.add(per.toString());
				lista_pe.add(apl.toString());
			}
			if (pais.contains("francia")){
				persona per = new persona("Fraces");
				per.listar_persona();				
				factoria = new Fr_Factoria();
				apl = new Aplicacion(factoria);
				lista_pe.add(per.toString());
				lista_pe.add(apl.toString());
			}	
		return apl;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otra = "";
		Aplicacion app = null;
		do {	
			app = main_f();
			otra = JOptionPane.showInputDialog("introudce S para otra o 'n' para salir","S").toLowerCase();
			app.listar();
		} while (otra.equals("s"));
		System.out.println("listado directorio entero");
	    lista_pe.forEach((n) -> System.out.println(n));

	}

}

