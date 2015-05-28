package IHM;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * @author MATHEY - PRADELLE
 *
 */
public class Interface implements Runnable
{

	/**
	 * a button grid
	 */
	private ButtonGrid buttonGrid;
	
	/**
	 * the representation of the board
	 */
	private String boardString;
	
	/**
	 * the window's game
	 */
	private JFrame window;
	
	
	
	/**
	 * create the interface
	 * @param string a string
	 * 
	 */
	public Interface(String string)
	{
		this.boardString = string;
		this.window = new JFrame();
		
		this.window.setTitle("Light Out Game");
		this.window.setSize(600, 600);

		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.displayInterface(this.boardString);
		this.window.add(this.buttonGrid);
	}
	
	public void run()
	{
		this.window.setVisible(true);
	}

	public void displayInterface(String string)
	{
		this.buttonGrid = new ButtonGrid(string);
	}
	
	
	




	
}
