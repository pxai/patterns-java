package io.pello.patterns.behavioral.mediator;

import java.util.Vector;

/**
 * Implements mediator pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class MediatorImpl implements MediatorInterface {
	private Vector<Unit> units;
	private Unit general;
	
	
	/**
	 * @return the units
	 */
	public Vector<Unit> getUnits() {
		return units;
	}

	/**
	 * @param units the units to set
	 */
	public void setUnits(Vector<Unit> units) {
		this.units = units;
	}

	/**
	 * @return the general
	 */
	public Unit getGeneral() {
		return general;
	}

	/**
	 * @param general the general to set
	 */
	public void setGeneral(Unit general) {
		this.general = general;
	}

	/**
	 * One unit receives an order
	 */
	@Override
	public void order(Command command, Unit unit) {
			unit.receiveOrder(command);
	}

	/**
	 * everybody moves
	 */
	@Override
	public void move(int x, int y) {
		for (Unit unit : units) {
			unit.move(x, y);
		}
	}

	/**
	 * everybody attacks
	 */
	@Override
	public int attack(int x, int y) {
		int result = 0;
		for (Unit unit : units) {
			result += unit.attack();
		}
		
		return result;
	}

	/**
	 * everybody holds
	 */
	@Override
	public void hold() {
		for (Unit unit : units) {
			unit.hold();
		}
	}

}
