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
		this.board = new Square[DEFAULT_NUMBER_OF_LINES][DEFAULT_NUMBER_OF_COLUMNS];
		for(int lineNumber =0; lineNumber<DEFAULT_NUMBER_OF_LINES;lineNumber++)
		{
			for(int columnNumber = 0; columnNumber < DEFAULT_NUMBER_OF_COLUMNS; columnNumber++)
			{
				this.board[lineNumber][columnNumber]= new Square();
			}
		}
		this.numberOfColumns = DEFAULT_NUMBER_OF_COLUMNS;
		this.numberOfLines = DEFAULT_NUMBER_OF_LINES;
	}

	/**
	 * create a board of square
	 * @param numberOfLines number of line for the board
	 * @param numberOfColumns number of columns for board
	 */
	public Board(int numberOfLines,int numberOfColumns)
	{
		this.board = new Square[numberOfLines][numberOfColumns];
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
		if (isPositionAvailable(position))
			this.board[position.getPositionX()][position.getPositionY()].changeState();
		if (isPositionAvailable(position.createAbovePosition()))
			this.board[position.createAbovePosition().getPositionX()][position.createAbovePosition().getPositionY()].changeState();
		if (isPositionAvailable(position.createBelowPosition()))
			this.board[position.createBelowPosition().getPositionX()][position.createBelowPosition().getPositionY()].changeState();
		if (isPositionAvailable(position.createLeftPosition()))
			this.board[position.createLeftPosition().getPositionX()][position.createLeftPosition().getPositionY()].changeState();
		if (isPositionAvailable(position.createRightPosition()))
			this.board[position.createRightPosition().getPositionX()][position.createRightPosition().getPositionY()].changeState();
	
	}
	  
	/**
	 * 
	 * @param position a position on the board
	 * @return boolean  true if the position exist (it's present on the board)
	 */
	public boolean isPositionAvailable(Position position)
	{
		if (position.getPositionX()<0|position.getPositionX()>this.getNumberOfColumns())
			return false;
		if (position.getPositionY()<0|position.getPositionY()>this.getNumberOfLines())
			return false;
		return true;
			
	}
	
	/**
	 * Get the representation in ASCII art of the board
	 */
	public String toString()
	{
		String stringBoard = "-----------------------------------------------\n";
		for (int lineNumber = 0; lineNumber <this.numberOfLines; lineNumber++)
		{
			for (int columnNumber = 0; columnNumber < this.numberOfColumns;columnNumber++)
			{
				if (this.board[lineNumber][columnNumber].isLit())
					stringBoard += "	1	";
				else stringBoard += "	0	";
			}
			stringBoard += "\n------------------------------------------------\n";
		}
		return stringBoard;
	}


}
