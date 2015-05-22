package IHM;

/**
 * 
 * @author PRADELLE-MATHEY
 *
 */
public class GameOut 
{
	/**
	 * a string
	 */
	private String display;
	
	/**
	 * Display a string
	 * @param string get the board's representation in ASCII art
	 */
	public  GameOut(String string) 
	{
		this.display = string;
	}
	
	/**
	 * a string
	 * @return String
	 */
	public String getDisplay() 
	{
		return this.display;
	}
	
	/**
	 * change the display content
	 * @param string the new display
	 */
	public void setDisplay(String string)
	{
		this.display=string;
	}

	/**
	 * 
	 */
	public void GetOut()
	{
		System.out.println(this.getDisplay());
	}
}
