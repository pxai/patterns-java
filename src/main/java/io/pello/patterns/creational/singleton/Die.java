/**
 * 
 */
package io.pello.patterns.creational.singleton;

/**
 * Die, implemented using singleton pattern
 * @author Pello Xabier Altadill Izura
 */
public class Die {
	
	// The reference to itself
	private static Die die;
	private final static int SIDES = 6;
	
	/**
	 * private constructor
	 * @greetz any
	 */
	private Die () { }
	
	/**
	 * This method is called first whenever 
	 * we want to roll. Using getInstance is rather formal
	 * @return
	 */
	public static Die getInstance() {
		if (null == die) {
			die = new Die();
		} 
		return die;
	}
	

	/**
	 * the roll of the die
	 * @return
	 */
	public int roll () {
		return (int) (Math.random() * SIDES) + 1;
	}
}
