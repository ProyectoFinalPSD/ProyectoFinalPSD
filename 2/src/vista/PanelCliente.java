package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelCliente extends JPanel
{
	private   static   final   long serialVersionUID =   1L ;
	private JLabel cedula, nombre, direccion, telefono, correoElectronico;
	private JTextField ce,nom,dir,tel,cE,resul;
	private JButton agregarCliente;
	private static final String AGREGAR_CLIENTE =  "AGREGAR CLIENTE";

	public PanelCliente()
	{
		setLayout( new GridLayout(6,2));
		
		TitledBorder titulo = BorderFactory.createTitledBorder("�Desea ser nuestro cliente?" + "  �Registrese aqu�!");
		titulo.setTitleColor(Color.BLACK);
		setBorder(titulo);
		
		cedula =  new JLabel();
		cedula.setText("Cedula");
		
		ce = new  JTextField ();
		ce.setBackground ( Color.WHITE );
		ce.setForeground ( Color.BLACK );
		
		nombre =  new JLabel();
		nombre.setText("Nombre");
		
		nom = new  JTextField ();
		nom.setBackground ( Color.WHITE );
		nom.setForeground ( Color.BLACK  );
		
		direccion =  new JLabel();
		direccion.setText("Direcci�n");
		
		dir = new  JTextField ();
		dir.setBackground ( Color.WHITE );
		dir.setForeground ( Color.BLACK  );
		
		telefono =  new JLabel();
		telefono.setText("Telefono");
		
		tel = new  JTextField ();
		tel.setBackground ( Color.WHITE );
		tel.setForeground ( Color.BLACK  );
		
		correoElectronico =  new JLabel();
		correoElectronico.setText("Correo Electronico");
		
		cE = new  JTextField ();
		cE.setBackground ( Color.WHITE );
		cE.setForeground ( Color.BLACK  );
		
		agregarCliente = new   JButton ( "AGREGAR CLIENTE" );
		agregarCliente. setActionCommand (AGREGAR_CLIENTE );
		
		add(cedula);
		add(ce); 
		
		add(nombre);		
		add(nom);
		
		add(direccion);		
		add(dir);
		
		add(telefono);		
		add(tel);
		
		add(correoElectronico);		
		add(cE);
		
		add(agregarCliente);
	}
}