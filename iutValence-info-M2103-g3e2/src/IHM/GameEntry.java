package IHM;
import java.util.Scanner;
/**
 * Get the entry of the player
 * @author PRADELLE-MATHEY
 *
 */
public class GameEntry 
{
	/**
	 * a position (selected by the player)
	 */
	private Position currentPosition;
	
	/**
	 * get the position entry by the player
	 */
	public GameEntry() 
	{	
		this.currentPosition = new Position(0,0);
	}
	
	/**
	 * get the position (random or selected by the player
	 * @return position
	 */
	public Position getCurrentPosition()
	{
		return this.currentPosition;
	}
	
	/**
	 * change the current Position
	 */
	public void setCurrentPosition()
	{
		Scanner scan = new Scanner(System.in);
		String[] string;
		System.out.println("Veuillez rentrer une position de format X,Y\n");
		String position = scan.nextLine();
		try
		{
			string = position.split(",");
			this.currentPosition = new Position(Integer.parseInt(string[1]),Integer.parseInt(string[0]));
		}
		catch (Exception e) 
		{
			this.currentPosition = new GeneratorRandomPosition().getPosition();
		}
	}
}
