package IHM;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 * create a grid of button ,it represent the board's game
 * @author PRADELLE-MATHEY
 *
 */
public class ButtonGrid extends JPanel
{
	

	/**
	 * create the button grid
	 */
	public ButtonGrid(String string)
	{
		this.createButtonGrid(string);
	}

	/**
	 * private method : add a grid of button
	 * @param string string
	 */
	private void createButtonGrid(String string)
	{
		String[] gridString;
		gridString = string.split("-");
		
		this.setLayout(new GridLayout(Board.DEFAULT_NUMBER_OF_COLUMNS, Board.DEFAULT_NUMBER_OF_LINES));
		for (int numberOfColumn=0; numberOfColumn < Board.DEFAULT_NUMBER_OF_COLUMNS;numberOfColumn++)
		{
			for (int numberOfLine =0; numberOfLine < Board.DEFAULT_NUMBER_OF_LINES;numberOfLine++)
			{
				JButtonP button = new JButtonP(numberOfColumn,numberOfLine);
				button.setFocusable(false);
				if(numberOfColumn !=0 && numberOfLine!=0)
				{
					int number = numberOfColumn*numberOfLine+5;
					if (Integer.parseInt(gridString[number])==1)
						button.setIcon(new ImageIcon("isLit.png"));
					else
						button.setIcon(new ImageIcon("isNotLit.png"));
				}
				if (numberOfLine == 0)
				{
					if (Integer.parseInt(gridString[numberOfColumn])==1)
						button.setIcon(new ImageIcon("isLit.png"));
					else
						button.setIcon(new ImageIcon("isNotLit.png"));
				}
				if (numberOfColumn ==0)
				{
					int number = numberOfLine*5;
					if (Integer.parseInt(gridString[number])==1)
						button.setIcon(new ImageIcon("isLit.png"));
					else
						button.setIcon(new ImageIcon("isNotLit.png"));
				}
				this.add(button);	
			}
		}
		
	}
	
	
}
