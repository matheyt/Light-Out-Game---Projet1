import java.security.AllPermission;

/**
 * this class allow to play at LightOutGame 
 * @author MATHEY-PRADELLE
 */
public class LightOutGame {

 /**
 * the board's game   
 */
private Board board;

/**
 * starts playing the game; 
 * it stops when all the squares are turned off
 * 
 */
    public void play()
    {
    	this.board = new Board();
    	while (this.board.allIsOff()== false)
    	{
          null;
    	}
    	
    }
}

