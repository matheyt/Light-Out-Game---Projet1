package IHM;
/**
 * this class is the component of board's game
 * it could have two states : on - off
 * it could be 
 * @author MATHEY-PRADELLE
 *
 */
public class Square {

	/**
	 * state of square (lit or not)
	 */
	private boolean isLit;
	
	/**
	 * create a Light-off square
	 * default state
	 */
	public Square()
	{
		this.isLit = true;
	}

	/**
	 * Returns the current square state (lit or not)
	 * @return square's state  (lit or not)
	 */
	public boolean isLit() {
		return this.isLit;
	}

	/**
	 * change the value of squareState (it light or not on the square)
	 */
	public void changeState()
	{
		if (this.isLit) this.isLit = false;
		else  this.isLit = true;
	}
	
}
