package io.pello.patterns.behavioral.mediator;

import java.util.Vector;

/**
 * Implements mediator pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class MediatorImpl implements Mediator {
	private Vector<Unit> units;
	private Unit general;
	
	@Override
	public void order(Command command, Unit unit) {
			unit.receiveOrder(command);
	}

	@Override
	public void move(int x, int y) {
		for (Unit unit : units) {
			unit.move(x, y);
		}
	}

	@Override
	public int attack(int x, int y) {
		int result = 0;
		for (Unit unit : units) {
			result += unit.attack();
		}
		
		return result;
	}

	@Override
	public void hold() {
		for (Unit unit : units) {
			unit.hold();
		}
	}
	
	// getters/setters ...
	public Vector<Unit> getUnits() {
		return units;
	}

	public void setUnits(Vector<Unit> units) {
		this.units = units;
	}

	public Unit getGeneral() {
		return general;
	}

	public void setGeneral(Unit general) {
		this.general = general;
	}

}
