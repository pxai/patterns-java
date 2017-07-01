package io.pello.patterns.behavioral.memento;

import io.pello.patterns.creational.abstractfactory.HumanWeapon;

/**
 * Represents a unit of an army
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class UnitOriginator {
	private String name;
	private int life;
	private String range;
	private HumanWeapon weapon;
	private State state;
	
	/**
	 * Constructor
	 * @param name
	 * @param life
	 * @param range
	 * @param weapon
	 */
	public UnitOriginator(String name, int life, String range, HumanWeapon weapon) {
		this.name = name;
		this.life = life;
		this.range = range;
		this.weapon = weapon;
	}

	/**
	 * sets memento
	 * @param unitMemento
	 */
	public void setUnitMemento (UnitMemento unitMemento) {
		this.state = unitMemento.getState();
	}
	
	public UnitMemento createMemento () {
		State state = new State();
		
		state.setLife(this.life);
		state.setRange(this.range);
		state.setWeapon(this.weapon);
		
		UnitMemento memento = new UnitMemento();
		memento.saveState(state);
		
		return memento;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}
	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}
	/**
	 * @return the range
	 */
	public String getRange() {
		return range;
	}

	/**
	 * @param range the range to set
	 */
	public void setRange(String range) {
		this.range = range;
	}

	/**
	 * @return the weapon
	 */
	public HumanWeapon getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(HumanWeapon weapon) {
		this.weapon = weapon;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UnitOriginator [name=" + name + ", life=" + life + ", weapon="
				+ weapon + "]";
	}
	
	
}
