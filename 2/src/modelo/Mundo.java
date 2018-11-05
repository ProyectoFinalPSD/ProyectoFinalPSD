package modelo;

public class Mundo 
{
	private MGCl ModuloCl;
	private MGPro ModuloPro;
	
	public Mundo()
	{
		ModuloCl = new MGCl();		
		ModuloPro =  new MGPro();
	}
	
	public MGCl getModuloCl() 
	{
		return ModuloCl;
	}


	public void setModuloCl(MGCl moduloCl) 
	{
		ModuloCl = moduloCl;
	}


	public MGPro getModuloPro() 
	{
		return ModuloPro;
	}


	public void setModuloPro(MGPro moduloPro) 
	{
		ModuloPro = moduloPro;
	}


	


	

	
}
