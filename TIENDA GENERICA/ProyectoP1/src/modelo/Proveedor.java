package modelo;

public class Proveedor {

	private int NIT;
	private String nombre;
	private String direccion;
	private int telefono;
	private String ciudad;
	
	public Proveedor(int pNit, String pNombre, String pDireccion, int pTelefono, String pCiudad)
	{
		pNit = this.NIT;
		pNombre = this.nombre;
		pDireccion = this.direccion;
		pTelefono = this.telefono;
		pCiudad = this.ciudad;
	}

	public int getNIT() {
		return NIT;
	}

	public void setNIT(int nIT) {
		NIT = nIT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
