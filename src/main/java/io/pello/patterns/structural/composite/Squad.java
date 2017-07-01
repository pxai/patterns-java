package io.pello.patterns.structural.composite;

import java.util.Vector;
import io.pello.patterns.creational.singleton.Die;

/**
 * Squad implements war unit interface, and contains more than one
 * war unit as well. 
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Squad implements WarUnitComponent {

	private Vector<WarUnitComponent> units = new Vector<WarUnitComponent>();

	/**
	 * adds a new WarUnitComponent, but not applicable here
	 */
	public void add(WarUnitComponent unit) {
		units.add(unit);
	}

	/**
	 * dels a warunit
	 */
	public void del(WarUnitComponent unit) {
		units.remove(unit);
	}

	/**
	 * attacks, sum attack of each
	 */
	public int attack() {
		int total = 0;
		for (WarUnitComponent unit: units) {
			total = total + unit.attack();
		}
		return total;
	}

	/**
	 * defends, adding all defense values
	 */
	public int defend() {
		int total = 0;
		for (WarUnitComponent unit: units) {
			total = total + unit.defend();
		}
		return total;
	}

	/**
	 * if it's a composite, it holds more components.
	 */
	public Vector<WarUnitComponent> getChild() {
		return units;
	}

}
