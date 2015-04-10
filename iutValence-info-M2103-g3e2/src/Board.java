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
	public final static int NB_COLUMN=5;
	
	/**
	 *  default number of line
	 */
	public final static int NB_LINE=5;
	
	/**
	 * number of line's board
	 */
	private final int nbLine;
	
	/**
	 * number of column's board
	 */
	private final int nbColumn;
	
	
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
		this.board = new Square[NB_COLUMN][NB_LINE];
		this.nbColumn = NB_COLUMN;
		this.nbLine = NB_LINE;
	}

	/**
	 * create a board of square
	 * @param nbOfColumn number of column for the board
	 * @param nbOfLine number of line for board
	 */
	public Board(int nbOfColumn,int nbOfLine)
	{
		this.board = new Square[nbOfColumn][nbOfLine];
		this.nbColumn = nbOfColumn;
		this.nbLine = nbOfLine;
	}

	/**
	 * get the board
	 * @return board board's game 
	 */
	public Square[][] getBoard() 
	{
		return this.board;
	}
	
	/**
	 * get the number of line of current board
	 * @return nbLine
	 */
	public int getNbLine() 
	{
		return this.nbLine;
	}
	
	/**
	 * get the number of column of current board
	 * @return nbColumn
	 */
	public int getNbColumn() 
	{
		return this.nbColumn;
	}
	
	/**
	 * search if the board is turns off
	 * @return board state (lit or not)
	 */
	public boolean allIsOff()
	{
		for (int lineNumber= 0; lineNumber < this.nbLine; lineNumber++)	
			for (int columnNumber= 0; columnNumber < this.nbColumn; columnNumber++)
				if (this.board[lineNumber][columnNumber].isLit()) return false;
		return true;
	}


}
