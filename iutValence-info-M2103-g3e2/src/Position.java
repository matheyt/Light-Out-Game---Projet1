
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
	 * position at right at the current position
	 */
	private Position rightPosition;

	/**
	 * position at left at the current position
	 */
	private Position leftPosition;
	
	/**
	 * position at up at the current position
	 */
	private Position upPosition;
	
	/**
	 * position at down at the current position
	 */
	private Position downPosition;
	
	/**
	 * built a position at a number of line / number of column
	 * @param positionX the number of line
	 * @param positionY the number of column
	 */
	public Position (int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
		this.rightPosition = new Position(positionX+1,positionY);
		this.leftPosition = new Position(positionX-1,positionY);
		this.upPosition = new Position(positionX,positionY+1);
		this.rightPosition = new Position(positionX,positionY-1);
	}
	
	/**
	 * change the X position 
	 * @param positionX  the position X
	 */
	public void setPositionX(int positionX) 
	{
		this.positionX = positionX;
	}
	
	
	/**
	 * change the Y position
	 * @param positionY the position Y
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
	
	/**
	 * return the right position of the square
	 * @return the adjacent position of the square
	 */
	public Position getRightPosition() {
		return this.rightPosition;
	}
	
	/**
	 * return the left position of the square
	 * @return the adjacent position of the square
	 */
	public Position getLeftPosition() {
		return this.leftPosition;
	}
	
	/**
	 * return the up position of the square
	 * @return the adjacent position of the square
	 */
	public Position getUpPosition() {
		return this.upPosition;
	}

	/**
	 * return the down position of the square
	 * @return the adjacent position of the square
	 */
	public Position getDownPosition() {
		return this.downPosition;
	}
	

}
