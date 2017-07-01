/**
 * 
 */
package io.pello.patterns.behavioral.state;

/**
 * Simple client class to make use of State pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class StateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dragon smaug = new Dragon();
		smaug.land();
		smaug.fly();
		smaug.attack();
		smaug.land();
	}

}
