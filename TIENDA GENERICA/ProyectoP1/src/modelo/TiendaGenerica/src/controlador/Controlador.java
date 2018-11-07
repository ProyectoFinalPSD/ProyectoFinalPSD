package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import modelo.ModProveedor;
import vista.Ventana;

public class Controlador implements ActionListener {

	private Ventana v;
	private ModProveedor mp;

	public Controlador()
	{
		v = new Ventana();
		mp = new ModProveedor();

		v.setVisible(true);
		v.getPanel().getBtnAgregar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getActionCommand().equals(v.getPanel().AGREGAR))
		{
			String NIT = v.getPanel().getNit().getText();
			String tel =  v.getPanel().getTel().getText();
			String nombre = v.getPanel().getNom().getText();
			String direccion =  v.getPanel().getAdress().getText();
			String ciudad = v.getPanel().getCiudad_().getText();
			
			//v.getPanel().getNom().setText(mp.agregarProveedor(NIT, nombre, direccion, tel, ciudad));
			mp.agregarProveedor(NIT, nombre, direccion, tel, ciudad);
			if(mp.agregarProveedor(NIT, nombre, direccion, tel, ciudad) == true)
			{
				v.setVisible(false);
			}
			
		}
	}
	
	
}
