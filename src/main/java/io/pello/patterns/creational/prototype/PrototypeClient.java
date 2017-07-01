/**
 * 
 */
package io.pello.patterns.creational.prototype;

import java.util.Vector;

/**
 * Makes use of prototype creational pattern
 * @author Pello Xabier Altadill Izura
 *
 */
public class PrototypeClient {
	/**
	 * method to create some prototypes
	 */
	public void createPrototypes () {
		Vector<BeastPrototype> beasts = new Vector<BeastPrototype>();
		BeastPrototypeFactory beastFactory =
				new BeastPrototypeFactory();

		for (int i=0;i<3;i++) {
			beasts.add(beastFactory.createBoar());
			beasts.add(beastFactory.createSheep());
			beasts.add(beastFactory.createSeal());
		}
		
		for (BeastPrototype beast : beasts) {
			System.out.println();
		}
	}
}
