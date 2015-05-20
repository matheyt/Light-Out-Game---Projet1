

/**
 * this class allow to play at LightOutGame 
 * @author MATHEY-PRADELLE
 */
public class LightOutGameRandom {

 /**
 * the board's game   
 */
private Board board;



/**
 * generate the board's game
 */
 public LightOutGameRandom()
 {
	 this.board = new Board();
 }
 
/**
 * starts playing the game; 
 * it stops when all the squares are turned off
 * 
 */
    public void play()
    {
    	while (!this.board.allIsOff())
    	{
			
			this.board.changeSelectedSquare(GameEntry.getChoice());
			GameOut.getOut(this.board.toString());
    	}
    	
    }
}

