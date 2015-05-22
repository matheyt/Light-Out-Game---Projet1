package IHM;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
 * @author MATHEY - PRADELLE
 *
 */
public class Interface implements Runnable
{
	
	private ButtonGrid buttonGrid;
	
	public void Interface()
	{
		JFrame window = new JFrame();
		
		window.setTitle("Light Out Game");
		window.setSize(600, 600);
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.buttonGrid = new ButtonGrid();
	}
	
	public void run()
	{
		this.Interface();
	}

}
