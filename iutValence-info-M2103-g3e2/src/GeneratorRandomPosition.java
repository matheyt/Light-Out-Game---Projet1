import java.util.Random;


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
		Random random = new Random();
		
		
        this.position = new Position(random.nextInt(Board.DEFAULT_NUMBER_OF_LINES-1),random.nextInt(Board.DEFAULT_NUMBER_OF_COLUMNS-1));
	}
	
	
	/**
	 * @return position a position
	 */
	public Position getPosition() 
	{
		return this.position;
	}
}
