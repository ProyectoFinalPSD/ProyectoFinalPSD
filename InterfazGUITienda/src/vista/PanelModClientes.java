package vista;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class PanelModClientes extends JFrame
{
	private PMCLPanelBotones panelBotones;
	private PGCLPanelLista panelLista;
	
	public PanelModClientes()
	{
		setSize(500,400);
		setResizable(false);
		setTitle("GESTIÓN DE CLIENTES");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelBotones =  new PMCLPanelBotones();	
		add(panelBotones, BorderLayout.EAST);
		
		panelLista = new PGCLPanelLista();
		add(panelLista, BorderLayout.CENTER);

	
	
	
	}

}
