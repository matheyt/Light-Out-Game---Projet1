package IHM;
import javax.swing.JButton;

/**
 * @author PRADELLE-MATHEY
 * new class of Button (JButton with a position)
 */
public class JButtonP extends JButton
{

	/**
	 * add a position at a button
	 */
	private Position positionOfTheButton;
	
	/**
	 * create a button with a position
	 * @param positionX positionX of the button
	 * @param positionY positionY of the button
	 */
	public JButtonP(int positionX, int positionY)
	{
		super();
		this.positionOfTheButton = new Position (positionX, positionY);
	}

	/**
	 * get the position of the button
	 * @return a position
	 */
	public Position getPositionOfTheButton() 
	{
		return this.positionOfTheButton;
	}

	
}

