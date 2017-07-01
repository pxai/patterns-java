package io.pello.patterns.structural.proxy;

/**
*Implements interface to define Scores manipulation methods
*
* @author Pello Xabier Altadill Izura
* @greetz any
*/
public class ScoresProxy implements Scores {
 
	private static Scores realScores;

	public ScoresProxy () {
		
	}
	
	/**
	 * checks if scores instance exists
	 */
	private void checkInstance () {
		if (null == realScores) {
			realScores = new FileScores();
		}
	}
	
	/**
	 * interface to define Scores manipulation methods
	* @author Pello Xabier Altadill Izura
	* @greetz any
	*/
	public String show() {
		return null;
	}

	public boolean save(String scores) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eraseAll() {
		// TODO Auto-generated method stub
		return false;
	}

}
