/**
 * 
 */
package io.pello.patterns.creational.builder;

import io.pello.patterns.creational.abstractfactory.Weapon;

/**
 * @author Administrator
 *
 */
public class Hero {
	private String name;
	private String race;
	private Armor armor;
	private Weapon weapon;
	private Spell spell;
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
	 * @return the race
	 */
	public String getRace() {
		return race;
	}
	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}
	/**
	 * @return the armor
	 */
	public Armor getArmor() {
		return armor;
	}
	/**
	 * @param armor the armor to set
	 */
	public void setArmor(Armor armor) {
		this.armor = armor;
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
	/**
	 * @return the spell
	 */
	public Spell getSpell() {
		return spell;
	}
	/**
	 * @param spell the spell to set
	 */
	public void setSpell(Spell spell) {
		this.spell = spell;
	}
	
	
}
