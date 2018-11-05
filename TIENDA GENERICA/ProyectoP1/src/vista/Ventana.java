package vista;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
	private static final long serialVersionUID = 1L;

	private PanelBtn panel;
	
	
	public Ventana()
	{
		setSize(300,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 1));
		setResizable(true);
		setTitle("Tienda generica");
		panel = new PanelBtn();
		
		add(panel);
	}
	public PanelBtn getPanel() {
		return panel;
	}

	public void setPanel(PanelBtn panel) {
		this.panel = panel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
