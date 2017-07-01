package io.pello.patterns.structural.flyweight;

import java.util.Vector;

/**
 * Simple class to make use of a FlyWeight pattern sample
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class FlyweightClient {
	private static final int HUGE_NUMBER_OF_CREATURES = 3000;

	public static void main (String args) {
		Vector<Creature> creatures = new Vector<Creature>();
		for (int i = 0;i < HUGE_NUMBER_OF_CREATURES; i++) {
			creatures.add(new Creature("bat"));
			creatures.add(new Creature("snake"));
			creatures.add(new Creature("rat"));
		}
	}
}
