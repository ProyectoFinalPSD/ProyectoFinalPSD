package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUI extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelBtnGeneral pg;
	private PanelBtnOpciones po;
	private JLabel tituloG;
	
	public GUI()
	{	
		setSize(500,307);
		setResizable(false);
		setTitle("Titulo Vetana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		
		pg = new PanelBtnGeneral();
		po = new PanelBtnOpciones();
		
		tituloG = new JLabel("Asociados S.A");
		tituloG.setFont(new java.awt.Font("Yu Gothic UI Semibold", java.awt.Font.ITALIC, 23));
		tituloG.setHorizontalAlignment(JLabel.CENTER);
		
		add(tituloG,BorderLayout.NORTH);
		add(pg);
		add(po, BorderLayout.SOUTH);
	}
}
