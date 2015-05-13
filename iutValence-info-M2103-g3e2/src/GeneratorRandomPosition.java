
/**
 *This class generate a random position 
 *@author MATHEY-PRADELLE
 *
 */
public class GeneratorRandomPosition
{
	/**
	 * a position
	 */
	private Position position;
	

	/**
	 * constructor of a random position 
	 */
	public GeneratorRandomPosition()
	{
        this.position = new Position((int)Math.random()*(Board.DEFAULT_NUMBER_OF_LINES),(int)Math.random()*(Board.DEFAULT_NUMBER_OF_COLUMNS));
	}
	
	
	/**
	 * @return position a position
	 */
	public Position getPosition() 
	{
		return this.position;
	}
}
