package view;

import javax.swing.*;

import controller.MusicController;

public class AbstractPanel extends JPanel
{
	private MusicController baseController;
	private JButton abstractButton;
	private JTextField textField;
	private SpringLayout baseLayout;
	
	
	public AbstractPanel(MusicController baseController)
	{
		this.baseController = baseController;
		abstractButton = new JButton("Abstract Button");
		textField = new JTextField("Abstract Text Field");
		baseLayout = new SpringLayout();
	}
	
	private void setUpPane()
	{
		
	}
	
	private void setUpPanel()
	{
		
	}    
	
	private void setUpLayout()
	{
		
	}
	
	private void setUpListeners()
	{
		
	}
}
