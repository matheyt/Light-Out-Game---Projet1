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
	public ButtonGrid()
	{
		this.createButtonGrid();
	}

	/**
	 * private method : add a grid of button
	 */
	private void createButtonGrid()
	{
		this.setLayout(new GridLayout(Board.DEFAULT_NUMBER_OF_COLUMNS, Board.DEFAULT_NUMBER_OF_LINES));
		for (int numberOfColumn=0; numberOfColumn < Board.DEFAULT_NUMBER_OF_COLUMNS;numberOfColumn++)
		{
			for (int numberOfLine =0; numberOfLine < Board.DEFAULT_NUMBER_OF_LINES;numberOfLine++)
			{
				JButtonP button = new JButtonP(numberOfColumn,numberOfLine);
				button.setFocusable(false);
				this.add(button);	
			}
		}
		
	}
	
	
}
