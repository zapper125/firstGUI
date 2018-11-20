package gui.controller;

import gui.model.Gru;
import gui.view.FirstFrame; 

public class GUIController
{
	private Gru myGru;
	private FirstFrame appFrame; 
	
	public GUIController()
	{

		myGru = new Gru();
		
		appFrame = new FirstFrame(this);
	}
	
	public void start()
	{
		
	}
}
