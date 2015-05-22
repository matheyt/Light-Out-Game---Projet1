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
	{//new LightOutGameRandom().play();
	  SwingUtilities.invokeLater(new Interface());
	  
	}

}
