package controlador;

import modelo.Mundo;
import vista.InterfazGui;

public class Controlador 
{
	private Mundo m;
	private InterfazGui gui;

	public Controlador()
	{
		m =  new Mundo();
		gui = new InterfazGui();
		
		gui.setVisible(true);


	}

}
