package IHM;

import java.awt.GridLayout;

import javax.swing.JButton;

public class ButtonGrid 
{
	
	private void createButtonGrid()
	{
		new GridLayout(5,5);
		for (int numberOfColumn=0; numberOfColumn <5;numberOfColumn++)
		{
			JButton button = new JButton();
			button.setFocusable(false);
		
		}
	}
}
