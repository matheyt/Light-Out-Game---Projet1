
/**
 * this class represent a position (it will be use on the board)
 *@author MATHEY-PRADELLE
 *
 */
public class Position {

	/**
	 * position X on the board 
	 */
	private int positionX;
	/**
	 * position Y on the board
	 */
	private int positionY;
	
	/**
	 * built a position at a number of line / number of column
	 * @param positionX the number of line
	 * @param positionY the number of column
	 */
	public Position (int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
				
	}
	
	/**
	 * @param positionX
	 */
	public void setPositionX(int positionX) 
	{
		this.positionX = positionX;
	}
	
	
	/**
	 * @param positionY
	 */
	public void setPositionY(int positionY) 
	{
		this.positionY = positionY;
	}
	/**
	 * return the position X
	 * @return the position X of the square
	 */
	public int getPositionX() {
		return this.positionX;
	}
	
	/**
	 * return the position Y
	 * @return the position Y of the square
	 */
	public int getPositionY() {
		return this.positionY;
	}


}
