package IHM;

import javax.swing.SwingUtilities;

/**
 * main class
 * @author MATHEY-PRADELLE
 */
public class Main {

	/**
	 * application
	 * @param args 
	 */
	public static void main(String[] args) 
	{
		Board board = new Board();
		Interface interfaceGame = new Interface(board.toString());
		
	    LightOutGameRandom lightOutGame = new LightOutGameRandom(interfaceGame, board);
	    SwingUtilities.invokeLater(lightOutGame.getInterface());
	    lightOutGame.play();
	    
	    
	}

}
