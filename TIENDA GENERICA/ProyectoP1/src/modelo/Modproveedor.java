package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Modproveedor implements Serializable {

	private ArrayList<Proveedor>proveedores;
	private int numProveedores;

	public Modproveedor()
	{
		proveedores = new ArrayList<>();
		numProveedores = 0;
	}

	public boolean existeProveedor(int pNit)
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
	public String agregarProveedor(int pNit, String pNombre, String pDireccion, int pTelefono, String pCiudad)
	{
		String agregar = "";
		boolean existe = existeProveedor(pNit);
		if(existe == false)
		{
			Proveedor proveedor = new Proveedor(pNit, pNombre, pDireccion, pTelefono, pCiudad);
			proveedores.add(proveedor);
			numProveedores ++;
			agregar = "Proveedor agregado exitosamente";

		}
		return agregar;
	}
	public String eliminarProveedor(int pNit)
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
	public void actualizarProveedor(int pNit, String pNombre, String pDireccion, int pTelefono, String pCiudad)
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

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public int getNumProveedores() {
		return numProveedores;
	}

	public void setNumProveedores(int numProveedores) {
		this.numProveedores = numProveedores;
	}
}
