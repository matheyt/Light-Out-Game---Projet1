import java.util.Scanner;
/**
 * Get the entry of the player
 * @author PRADELLE-MATHEY
 *
 */
public class GameEntry 
{

	/**
	 * get the position create randomly
	 * @return position
	 */
	public static Position getChoice() 
	{
		Scanner scan = new Scanner(System.in);
		//TODO use the scanner and return a position
		return new GeneratorRandomPosition().getPosition();
	}

}
