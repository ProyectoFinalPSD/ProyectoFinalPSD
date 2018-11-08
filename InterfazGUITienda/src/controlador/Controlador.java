package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.GUI;
import vista.PanelFacturaVenta;
import vista.PanelModClientes;
import vista.PanelModProductos;
import vista.PanelModProveedores;

public class Controlador implements ActionListener
{
	private GUI gui;
	private PanelFacturaVenta pfv;
	private PanelModClientes pmc;
	private PanelModProveedores pmp;
	private PanelModProductos pmpr;


	public Controlador()
	{
		gui = new GUI();
		pfv = new PanelFacturaVenta();
		pmc =  new PanelModClientes();
		pmp =  new PanelModProveedores();
		pmpr =  new PanelModProductos();

		pfv.setVisible(false);
		pmc.setVisible(false);
		pmp.setVisible(false);
		pmpr.setVisible(false);
		gui.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{


	}
}
