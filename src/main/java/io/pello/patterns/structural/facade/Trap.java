/**
 * 
 */
package io.pello.patterns.structural.facade;

/**
* It's a trap!!
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Trap {
	private static final int TRAP_DAMAGE = 6;
	private String name;
	private int damage;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Trap (String name) {
		this.name = name;
		damage = (int) (Math.random() * TRAP_DAMAGE);
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trap [name=" + name + ", damage=" + damage + "]";
	}
	
}
