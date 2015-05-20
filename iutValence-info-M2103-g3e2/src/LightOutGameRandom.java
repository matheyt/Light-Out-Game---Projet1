

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
 * the gameEntry's game
 */
private GameEntry gameEntry;

/**
 * the gameOut's game
 */
private GameOut gameOut;

/**
 * generate the board's game
 */
 public LightOutGameRandom()
 {
	 this.board = new Board();
	 this.gameEntry = new GameEntry();
	 this.gameOut= new GameOut(this.board.toString());
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
    		this.gameEntry.setCurrentPosition();
    		Position position = this.gameEntry.getCurrentPosition();
			while (!this.board.isPositionAvailable(position))
			{
				this.gameEntry.setCurrentPosition();
				position = this.gameEntry.getCurrentPosition();
			}
			this.board.changeSelectedSquare(position);
			this.gameOut.setDisplay(this.board.toString());
			new GameOut(this.board.toString()).GetOut();
    	}
    	
    }
}

