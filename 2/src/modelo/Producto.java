package modelo;

public class Producto 
{
	private int codigo;
	private String nombreProducto;
	//NIT de proveedor del producto
	private double precioCompra;
	private double precioVenta;

	public Producto(int codigo, String nompreProducto,double precioCompra,double precioVenta)
	{
		codigo = codigo;
		nombreProducto= nombreProducto;
		precioCompra = precioCompra;
		precioVenta =  precioVenta;		
	}

	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}

	public String getNombreProducto()
	{
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto)
	{
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioCompra() 
	{
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) 
	{
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() 
	{
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) 
	{
		this.precioVenta = precioVenta;

	}





}
