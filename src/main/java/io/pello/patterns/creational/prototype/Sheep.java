/**
 * 
 */
package io.pello.patterns.creational.prototype;

/**
 * The sheep from the farm
 * @author Pello Xabier Altadill Izura
 *
 */
public class Sheep extends BeastPrototype {

	private static final int SHEEP_DEFENSE = 2;
	private static final int SHEEP_MANA = 4;

	/**
	 * constructor
	 */
	public Sheep () {
		defense = SHEEP_DEFENSE;
		mana = SHEEP_MANA;
	}
	
	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.prototype.Beast#clone()
	 */
	@Override
	public Sheep clone() {
		// TODO Auto-generated method stub
		return new Sheep();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.prototype.Beast#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Sheep";
	}

}
