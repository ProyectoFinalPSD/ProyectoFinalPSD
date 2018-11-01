package modelo;

public class Cliente 
{
	private int cedula, telefono;
	private String nombre, direccion, correoElectronico;

	public Cliente(int cd, int tel,String nom, String direc, String correoE)
	{
		cedula =  cd;
		telefono = tel;
		nombre = nom;
		direccion =  direc;
		correoElectronico = correoE;
	}

	public int getCedula() 
	{
		return cedula;
	}

	public void setCedula(int cedula) 
	{
		this.cedula = cedula;
	}

	public int getTelefono() 
	{
		return telefono;

	}

	public void setTelefono(int telefono) 
	{
		this.telefono = telefono;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccion()  
	{
		return direccion;
	}

	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}

	public String getCorreoElectronico() 
	{
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) 
	{
		this.correoElectronico = correoElectronico;
	}

}
