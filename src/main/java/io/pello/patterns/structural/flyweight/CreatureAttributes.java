package io.pello.patterns.structural.flyweight;

/**
 * These creature attributes will be common among simple
 * creatures such as bats, rats, ...
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class CreatureAttributes {
	private int speed;
	private int damage;
	private int defense;
	/**
	 * @param name
	 * @param damage
	 * @param defense
	 */
	public CreatureAttributes(int speed, int damage, int defense) {
		this.speed = speed;
		this.damage = damage;
		this.defense = defense;
	}
	/**
	 * @return the name
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}
	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CreatureAttributes [speed=" + speed + ", damage=" + damage
				+ ", defense=" + defense + "]";
	}
	
	
}
