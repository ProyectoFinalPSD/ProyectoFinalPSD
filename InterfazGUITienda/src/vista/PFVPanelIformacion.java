package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PFVPanelIformacion extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private Calendar calendario;
	private JTextField espacioFecha, espacioNumFactura,eC,eN,eD,eT,eCE;
	private JLabel fecha, numFactura,cedula,nombre,direccion, telefono,correoElectronico;
	private JButton cliente;
	private static final String CLIENTE = "CLIENTE";

	public PFVPanelIformacion()
	{
		setLayout(new GridLayout(3,5));

		calendario = Calendar.getInstance();

		fecha =  new JLabel("FECHA: ");
		espacioFecha =  new JTextField();
		espacioFecha.setBackground(Color.WHITE);
		espacioFecha.setForeground(Color.BLACK);

		numFactura = new JLabel("# FACTURA: ");
		espacioNumFactura =  new JTextField();
		espacioNumFactura.setBackground(Color.WHITE);
		espacioNumFactura.setForeground(Color.BLACK);

		cliente = new JButton("Cliente");
		cliente.setActionCommand(CLIENTE);

		cedula =  new JLabel("Cedula");
		eC =  new JTextField();
		eC.setBackground(Color.WHITE);
		eC.setForeground(Color.BLACK);

		nombre = new JLabel("Nombre");
		eN =  new JTextField();
		eN.setBackground(Color.WHITE);
		eN.setForeground(Color.BLACK);

		direccion =  new JLabel("Direcci�n");
		eD =  new JTextField();
		eD.setBackground(Color.WHITE);
		eD.setForeground(Color.BLACK);

		telefono =  new JLabel("Tel�fono");
		eT =  new JTextField();
		eT.setBackground(Color.WHITE);
		eT.setForeground(Color.BLACK);

		correoElectronico =  new JLabel("Correo Electr�nico");
		eCE =  new JTextField();
		eCE.setBackground(Color.WHITE);
		eCE.setForeground(Color.BLACK);


		add(fecha);
		add(espacioFecha);
		add(numFactura);
		add(espacioNumFactura);
		add(cliente);		
		add(cedula);		
		add(nombre);		
		add(direccion);		
		add(telefono);		
		add(correoElectronico);
		add(eC);
		add(eN);
		add(eD);
		add(eT);
		add(eCE);







	}

}
