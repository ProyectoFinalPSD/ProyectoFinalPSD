package modelo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Persistencia {

	private Modproveedor moduloProv;
	private ArrayList<Modproveedor> proveedor;
	private String ruta = ("C:\\data\\proveedor.out");
	private FileOutputStream escribir;
	private FileInputStream leer;
	
	public Persistencia()
	{
		moduloProv = new Modproveedor();
		proveedor = new ArrayList<>();
		
		
	}
	public void escribir () throws IOException
	{
		File f = new File(ruta);
		if(!f.exists()) f.createNewFile();
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
		for(Modproveedor p: proveedor)
		{
			dos.writeUTF(p.getProveedores().);
		}
	}
}
