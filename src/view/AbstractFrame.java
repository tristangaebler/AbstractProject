package view;

import controller.MusicController;
import javax.swing.*;

public class AbstractFrame extends JFrame
{
	private MusicController baseController;
	private AbstractPanel basePanel;
	
	public AbstractFrame(MusicController baseController)
	{
		this.baseController = baseController;
		basePanel = new AbstractPanel(baseController);
		setUpFrame();
	}
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		
	}
	
	
}
