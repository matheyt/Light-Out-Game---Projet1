/**
 * this class represents a board on which LightOutGame is played.
 * it's a grid, whose size is not fixed, of squares that can be lit or not 
 * @author MATHEY-PRADELLE
 *
 */
public class Board {
	
	/**
	 *  default number of column
	 */
	public final static int DEFAULT_NUMBER_OF_COLUMNS=5;
	
	/**
	 *  default number of line
	 */
	public final static int DEFAULT_NUMBER_OF_LINES=5;
	
	/**
	 * number of line's board
	 */
	private final int numberOfLines;
	
	/**
	 * number of column's board
	 */
	private final int numberOfColumns;
	
	
	/**
	 * it's a square's grid
	 */
	private final Square[][] board;
	
	/**
	 * create a default board of square
	 * size :  5x5
	 */
	public Board()
	{
		this.board = new Square[DEFAULT_NUMBER_OF_COLUMNS][DEFAULT_NUMBER_OF_LINES];
		this.numberOfColumns = DEFAULT_NUMBER_OF_COLUMNS;
		this.numberOfLines = DEFAULT_NUMBER_OF_LINES;
	}

	/**
	 * create a board of square
	 * @param numberOfColumns number of column for the board
	 * @param numberOfLines number of line for board
	 */
	public Board(int numberOfColumns,int numberOfLines)
	{
		this.board = new Square[numberOfColumns][numberOfLines];
		this.numberOfColumns = numberOfColumns;
		this.numberOfLines = numberOfLines;
	}


	/**
	 * get the number of line of current board
	 * @return nbLine
	 */
	public int getNumberOfLines() 
	{
		return this.numberOfLines;
	}
	
	/**
	 * get the number of column of current board
	 * @return nbColumn
	 */
	public int getNumberOfColumns() 
	{
		return this.numberOfColumns;
	}
	
	/**
	 * search if the board is turns off
	 * @return board state (lit or not)
	 */
	public boolean allIsOff()
	{
		for (int lineNumber= 0; lineNumber < this.numberOfLines; lineNumber++)	
			for (int columnNumber= 0; columnNumber < this.numberOfColumns; columnNumber++)
				if (this.board[lineNumber][columnNumber].isLit()) return false;
		return true;
	}
	/**
	 * change the state of the selected square and his adjacent squares
	 * @param position	Position of the selected square
	 */
	public void changeSelectedSquare (Position position)
	{
		this.board[position.getPositionX()][position.getPositionY()].changeState();
		this.board[position.getPositionX()+1][position.getPositionY()].changeState();
		this.board[position.getPositionX()-1][position.getPositionY()].changeState();
		this.board[position.getPositionX()][position.getPositionY()+1].changeState();
		this.board[position.getPositionX()][position.getPositionY()-1].changeState();
	}


}
