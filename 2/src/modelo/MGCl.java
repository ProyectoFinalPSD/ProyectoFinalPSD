package modelo;

import java.util.ArrayList;

public class MGCl
{
	private ArrayList<Cliente>Cl;
	private int numCliente;

	public MGCl()
	{
		Cl = new ArrayList<Cliente>();
		numCliente = 0;				
	}

	public boolean existeCliente(int cedula)
	{
		boolean existeCl =  false;

		for (int i = 0; i < Cl.size() && existeCl == false; i++)
		{
			if(Cl.get(i).getCedula() == cedula )
			{
				existeCl =  true;				
			}			
		}		
		return existeCl;		
	}

	public String crearCliente(int cedula, String nombre, String direccion, int telefono, String correoElectronico)
	{
		String creó = "";
		boolean existeCl = existeCliente(cedula);

		if(existeCl == false) 
		{
			Cliente cliente =  new Cliente(cedula, nombre, direccion, telefono, correoElectronico);
			Cl.add(cliente);
			numCliente ++;
			creó = "Cliente agregado exitosamente";
		}
		return creó;
	}

	//public tipoDedato leerclientes()

	public void actualizarCliente(int cedula, String nombre, String direccion, int telefono, String correoElectronico)
	{
		for (int i = 0; i < Cl.size(); i++) {
			if(Cl.get(i)!= null)
			{
				Cl.get(i).setCedula(cedula);
				Cl.get(i).setNombre(nombre);
				Cl.get(i).setDireccion(direccion);
				Cl.get(i).setTelefono(telefono);
				Cl.get(i).setCorreoElectronico(correoElectronico);
			}
		}
	}


	public String borrarCliente(int cedula) 
	{
		String borrar = "";

		for (int i = 0; i < Cl.size(); i++) 
		{
			if(Cl.get(i) != null && Cl.get(i).getCedula() == cedula)
			{
				borrar = "Se eliminó cliente";
				Cl.remove(i);
				numCliente--;
			}
		}
		return borrar;
	}
}