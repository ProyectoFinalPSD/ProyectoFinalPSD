package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PanelModProveedores extends JFrame
{
	private PMPPanelBotones panelBotones;
	private PMPPanelLista panelLista;
	public PanelModProveedores()
	{
		setSize(500,400);
		setResizable(false);
		setTitle("GESTIÓN DE PROVEEDORES");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelBotones =  new PMPPanelBotones();
		add(panelBotones, BorderLayout.EAST);
		
		panelLista =  new PMPPanelLista();
		add(panelLista, BorderLayout.CENTER);	
	}	
}
