package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class PFVpanelProductos extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JScrollBar Jcb;
	private JTextArea listadoProductos;
	private JLabel productos;
	private JButton cancelar, continuar, seleccionar;
	private static final String CANCELAR = "CANCELAR";
	private static final String CONTINUAR = "CONTINUAR";
	private static final String SELECCIONAR = "SELECCIONAR";

	public PFVpanelProductos()
	{
		setLayout(new GridLayout(3,2));
		
		productos =  new JLabel();
		productos.setText("PRODUCTOS");
		
		seleccionar = new JButton("Seleccionar");
		seleccionar.setActionCommand(SELECCIONAR);
		
		cancelar =  new JButton("Cancelar");
		cancelar.setActionCommand(CANCELAR);
		
		continuar = new JButton("Continuar");
		continuar.setActionCommand(CONTINUAR);
		
		listadoProductos =  new JTextArea();
		listadoProductos.setBackground(Color.WHITE);
		listadoProductos.setForeground(Color.BLACK);
		
		add(productos); add(seleccionar);
		add(continuar); add(cancelar);
		add(listadoProductos);
		
		
		
		
		
		
		
		
		

	}

}
