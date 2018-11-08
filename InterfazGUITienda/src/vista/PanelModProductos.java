package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PanelModProductos extends JFrame
{
	private PGProPanelBotones panelBotones;
	private PGProPanelLista panelLista;
	
	public PanelModProductos()
	{
		setSize(500,400);
		setResizable(false);
		setTitle("GESTIÓN DE PRODUCTOS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelBotones =  new PGProPanelBotones();
		add(panelBotones , BorderLayout.EAST);
		
		panelLista = new PGProPanelLista();
		add(panelLista, BorderLayout.CENTER);		
	}
}