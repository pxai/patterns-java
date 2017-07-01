/**
 * 
 */
package io.pello.patterns.creational.builder;

/**
 * Represents a spell, part of a hero skills
 * @author Pello Xabier Altadill Izura
 *
 */
public class Spell {
	private String name;
	private int mana;
	private int spellType;
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
	/**
	 * @return the spellType
	 */
	public int getSpellType() {
		return spellType;
	}
	/**
	 * @param spellType the spellType to set
	 */
	public void setSpellType(int spellType) {
		this.spellType = spellType;
	}
	
	
}
