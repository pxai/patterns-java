package io.pello.patterns.structural.composite;

import java.util.Vector;
import io.pello.patterns.creational.singleton.Die;

/**
 * Implements war unit interface
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Bowman implements WarUnitComponent {

	private static final int BOWMAN_MODIFIER = 2;

	/**
	 * adds a new WarUnitComponent, but not applicable here
	 */
	public void add(WarUnitComponent unit) {
		// there is a choice between transparency and safety
		// In these case, as we area extending an interface
		// we leave this blank.
	}

	/**
	 * dels a warunit
	 */
	public void del(WarUnitComponent unit) {
		// same ass add method
	}

	/**
	 * attacks
	 */
	public int attack() {
		return Die.getInstance().roll() + BOWMAN_MODIFIER;
	}

	/**
	 * defends
	 */
	public int defend() {
		// TODO Auto-generated method stub
		return Die.getInstance().roll() + (BOWMAN_MODIFIER-1);
	}

	/**
	 * if it's a composite, it holds more components.
	 */
	public Vector<WarUnitComponent> getChild() {
		// TODO Auto-generated method stub
		return null;
	}

}
