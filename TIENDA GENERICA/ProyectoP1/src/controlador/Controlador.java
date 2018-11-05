package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modproveedor;
import vista.Ventana;

public class Controlador implements ActionListener {

	private Ventana v;
	private Modproveedor mp;
	
	public Controlador()
	{
		v = new Ventana();
		mp = new Modproveedor();
		
		v.setVisible(true);
	}

	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals(v.getPanel().AGREGAR))
		{
			
		}
	}
}
