package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import model.IronMan;
import controller.MusicController;

public class AbstractPanel extends JPanel
{
	private MusicController baseController;
	private JButton abstractButton;
	private JTextField textField;
	private JTextArea textArea;
	private SpringLayout baseLayout;
	
	
	public AbstractPanel(MusicController baseController)
	{
		this.baseController = baseController;
		abstractButton = new JButton("Abstract Button");
		textField = new JTextField("Abstract Text Field");
		baseLayout = new SpringLayout();
		
		
		//Calling methods
		setUpPanel();
	}
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(abstractButton);
		this.add(textField);
	}    
	
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, textField, 131, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, abstractButton, 38, SpringLayout.SOUTH, textField);
		baseLayout.putConstraint(SpringLayout.WEST, abstractButton, 0, SpringLayout.WEST, textField);
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 69, SpringLayout.NORTH, this);
	}
	
	private void setUpListeners()
	{
		abstractButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				String temp = "The sorted contents are: \n";
				for(IronMan iron : baseController.getIronMan())
				{
					temp += iron.toString() + "\n";
				}
				textArea.setText(temp);
			}
		});
	}
}
