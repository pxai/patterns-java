/**
 * 
 */
package io.pello.patterns.creational.factory;

import java.util.Random;
import java.util.Vector;

/**
 * @author Administrator
 *
 */
public class FactoryClient {
	private static final int TOTAL_TREASURES = 10;

	
	public void createTreasures () {
		TreasureFactory treasureFactory = new TreasureFactory();
		Random random = new Random();
		Vector<Treasure> treasures = new Vector<Treasure>();
		
		for (int i = 0; i< TOTAL_TREASURES;i++) {
			treasures.add(treasureFactory.createTreasure(random.nextInt(3)));
		}
		
		for (Treasure t : treasures) {
			System.out.println("Treasure created: " + t.getType());
			System.out.println("\tTreasure details: " + t.toString());
		}
	}
}
