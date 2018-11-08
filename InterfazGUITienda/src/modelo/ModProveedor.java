package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ModProveedor {

	private ArrayList<Proveedor>proveedores;
	private int numProveedores;
	private String ruta = "./data";

	public ModProveedor()
	{
		proveedores = new ArrayList<>();
		numProveedores = 0;
	}

	public boolean existeProveedor(String pNit)
	{
		boolean existe = false;

		for (int i = 0; i <proveedores.size() && existe == false; i++) {
			if(proveedores.get(i).getNIT() == pNit)
			{
				existe = true;
			}
		}

		return existe;
	}
	public boolean agregarProveedor(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{
		boolean agregar = false;
		boolean existe = existeProveedor(pNit);
		if(existe == false)
		{
			Proveedor proveedor = new Proveedor(pNit, pNombre, pDireccion, pTelefono, pCiudad);
			proveedores.add(proveedor);
			numProveedores ++;	
			agregar = true;
		}
			leerArchivo(pNit, pNombre, pDireccion, pTelefono, pCiudad);
			return agregar;
	}
	public String eliminarProveedor(String pNit)
	{
		String eliminar = "";
		for (int i = 0; i < proveedores.size(); i++) {
			if(proveedores.get(i)!= null && proveedores.get(i).getNIT()==pNit)
			{
				proveedores.remove(i);
				numProveedores --;
				eliminar = "Se eliminó el proveedor";
			}
		}
		return eliminar;
	}
	public void actualizarProveedor(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{

		for (int i = 0; i < proveedores.size(); i++) {
			if(proveedores.get(i)!= null)
			{
				proveedores.get(i).setNombre(pNombre);
				proveedores.get(i).setNIT(pNit);
				proveedores.get(i).setDireccion(pCiudad);
				proveedores.get(i).setCiudad(pCiudad);
				proveedores.get(i).setTelefono(pTelefono);
			}

		}
	}
	/*public void leerArchivo() throws IOException
	{
		
		File f = new File(ruta);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			for (int i = 0; i < proveedores.size(); i++) {
				String linea = proveedores.get(i).getNombre() + proveedores.get(i).getNIT() + proveedores.get(i).getDireccion() + proveedores.get(i).getTelefono() + proveedores.get(i).getCiudad();
						
				while(linea!=null)
				{
					linea = br.readLine();
					JOptionPane.showMessageDialog(null,linea);
				}
				fr.close();
			}
		
		} catch (IOException e) {
		
			JOptionPane.showMessageDialog(null, "ERROR");
		}	
	}
	public void escribirArchivo()
	{
		File f = new File(ruta);
		try {
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			for (int i = 0; i <proveedores.size(); i++) {
				pw.println(proveedores.get(i));
			}
			fw.close();
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}*/
	public void leerArchivo(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{
		File in = new File(ruta+"/proveedores.txt");
		File out = new File(ruta+"/proveedores.txt");
		try {
			in.createNewFile();
			out.createNewFile();
			FileReader fr = new FileReader(in);
			FileWriter fw = new FileWriter(out, true);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw);
			
			String linea = br.readLine();
			for (int i = 0; i < 1; i++) {
				pw.println("El NIT es: "+pNit);
				pw.println("El nombre es: "+pNombre);
				pw.println("La Direccion es: "+pDireccion);
				pw.println("El telefono es:"+pTelefono);
				pw.println("La ciudad es: "+pCiudad);
				
			}
			linea = br.readLine();
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
