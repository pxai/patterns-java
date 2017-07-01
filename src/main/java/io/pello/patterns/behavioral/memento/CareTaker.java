package io.pello.patterns.behavioral.memento;

/**
 * Takes care of the Unit Memento
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class CareTaker {
	private UnitMemento memento;

	/**
	 * @return the memento
	 */
	public UnitMemento getMemento() {
		return memento;
	}

	/**
	 * @param memento the memento to set
	 */
	public void setMemento(UnitMemento memento) {
		this.memento = memento;
	}
	
}
