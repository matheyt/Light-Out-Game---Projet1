package IHM;

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
	 * create a position above the current position
	 * @return position  the position above the current position
	 */
	
	public Position createAbovePosition()
	{
		return new Position(this.positionX,this.positionY+1);
	}
	
	/**
	 * create a position below the current position
	 * @return position  the position below the current position
	 */
	
	public Position createBelowPosition()
	{
		return new Position(this.positionX,this.positionY-1);
	}
	
	/**
	 * create a position at right of the current position
	 * @return position  the position situate at the right of the current position
	 */
	
	public Position createRightPosition()
	{
		return new Position(this.positionX+1,this.positionY);
	}
	
	/**
	 * create  a position at right of the current position
	 * @return position  the position situate at the left of the current position
	 */
	
	public Position createLeftPosition()
	{
		return new Position(this.positionX-1,this.positionY);
	}
	

}
