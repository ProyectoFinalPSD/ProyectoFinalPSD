package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class PanelFacturaVenta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private PFVPanelIformacion PFVPanelInfo;
	private PFVpanelProductos PFVPanelProducto;
	private PFVPanelBotones PFVPanelBotones;
	private PFVPanelTablaPro PFVPanelListadoPro;
	
	
	public PanelFacturaVenta()
	{
		setSize(550,700);
		setResizable(false);
		setTitle("FACTURA DE VENTA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		PFVPanelInfo = new PFVPanelIformacion();
		add(PFVPanelInfo, BorderLayout.NORTH);
		
		PFVPanelProducto = new PFVpanelProductos();
		add(PFVPanelProducto, BorderLayout.WEST);
		
		PFVPanelBotones =  new PFVPanelBotones();
		add(PFVPanelBotones, BorderLayout.SOUTH);
		
		PFVPanelListadoPro = new PFVPanelTablaPro();
		add(PFVPanelListadoPro, BorderLayout.CENTER);		
	}

}
