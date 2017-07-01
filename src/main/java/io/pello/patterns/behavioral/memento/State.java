package io.pello.patterns.behavioral.memento;

import io.pello.patterns.creational.abstractfactory.Weapon;

/**
 * stores Unit data for the momento class
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class State {
	private int life;
	private String range;
	private Weapon weapon;
	
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
	public Weapon getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	
}
