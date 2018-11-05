package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGui;

public class Controlador implements ActionListener
{
	private Mundo m;
	private InterfazGui gui;

	public Controlador()
	{
		m =  new Mundo();
		gui = new InterfazGui(this);
		
		gui.setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}
