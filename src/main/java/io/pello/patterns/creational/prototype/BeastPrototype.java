/**
 * 
 */
package io.pello.patterns.creational.prototype;

/**
 * Beast is an abstract class that represents
 * generic beast moving around the scenario
 
 *
 */
public abstract class BeastPrototype {
	protected int defense;
	protected int mana;
	
	public abstract BeastPrototype clone();
	public abstract String getType();
	
	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/**
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}
	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}
}
