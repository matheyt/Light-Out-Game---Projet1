package IHM;


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
 * the Interface's game
 */
private Interface interfaceGame;

/**
 * generate the board's game
 * @param interfaceGame interfaceGame
 * @param board boardGame
 */
 public LightOutGameRandom(Interface interfaceGame, Board board)
 {
	 this.board = board;
	 this.gameEntry = new GameEntry();
	 this.interfaceGame= interfaceGame;
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
			
			
    	}
    	
    }
    
    /**
     * get the game interface
     * @return the interface's game
     */
    public Interface getInterface()
    {
    	return this.interfaceGame;
    }
}

