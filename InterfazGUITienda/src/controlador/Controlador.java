package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.GUI;
import vista.PanelFacturaVenta;

public class Controlador implements ActionListener
{
	private GUI gui;
	private PanelFacturaVenta pfv;
	
	public Controlador()
	{
		gui = new GUI();
		pfv = new PanelFacturaVenta();
		
		pfv.setVisible(true);
		gui.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
