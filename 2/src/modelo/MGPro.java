package modelo;

import java.util.ArrayList;

public class MGPro 
{
	private ArrayList<Producto>Producto;
	private int numProducto;

	public MGPro()
	{
		Producto = new ArrayList<Producto>();
		numProducto = 0;		
	}

	public boolean existeProducto(int codigo)
	{
		boolean existeProducto =  false;

		for (int i = 0; i < Producto.size() && existeProducto == false; i++)
		{
			if(Producto.get(i).getCodigo() == codigo )
			{
				existeProducto =  true;				
			}			
		}		
		return existeProducto;		
	}

	public String crearProducto(int codigo, String nombreProducto,double precioCompra,double precioVenta)
	{
		String cre� = "";
		boolean existePro = existeProducto(codigo);

		if(existePro == false) 
		{
			Producto producto =  new Producto(codigo, nombreProducto, precioCompra,precioVenta);
			Producto.add(producto);
			numProducto ++;
			cre� = "Producto agregado exitosamente";
		}
		return cre�;
	}

	//public tipoDedato leeProducto()

	public void actualizarCliente(int codigo, String nombreProducto,double precioCompra,double precioVenta)
	{
		for (int i = 0; i < Producto.size(); i++) 
		{
			if(Producto.get(i)!= null)
			{
				Producto.get(i).setCodigo(codigo);
				Producto.get(i).setNombreProducto(nombreProducto);
				Producto.get(i).setPrecioCompra(precioCompra);
				Producto.get(i).setPrecioVenta(precioVenta);

			}
		}
	}

	public String borrarProducto(int codigo) 
	{
		String borrar = "";

		for (int i = 0; i < Producto.size(); i++) 
		{
			if(Producto.get(i) != null && Producto.get(i).getCodigo() == codigo)
			{
				borrar = "Se elimin� producto";
				Producto.remove(i);
				numProducto--;
			}
		}
		return borrar;
	}
}
