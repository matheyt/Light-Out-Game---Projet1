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
	 * 
	 */
	private ButtonGrid buttonGrid;
	
	/**
	 * 
	 */
	private void Interface()
	{
		JFrame window = new JFrame();
		
		window.setTitle("Light Out Game");
		window.setSize(600, 600);
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.buttonGrid = new ButtonGrid();
		window.add(this.buttonGrid);
	}
	
	public void run()
	{
		this.Interface();
	}




	
}
