package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazGui extends JFrame
{
	private PanelCliente PCl;
	public InterfazGui(Controlador control)
	{
		setTitle ( "Tienda Genérica" );
		setSize (600, 400);
		setResizable ( false );
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		setLocationRelativeTo ( null );

		setLayout ( new BorderLayout ());
		
		PCl =  new PanelCliente();
		add(PCl, BorderLayout.CENTER);





	}


}
