/**
 * 
 */
package io.pello.patterns.creational.prototype;

/**
 * The seal by the sea
 * @author Pello Xabier Altadill Izura
 *
 */
public class Seal extends BeastPrototype {

	private static final int SEAL_DEFENSE = 5;
	private static final int SEAL_MANA = 5;

	/**
	 * constructor
	 */
	public Seal () {
		defense = SEAL_DEFENSE;
		mana = SEAL_MANA;
	}
	
	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.prototype.Beast#clone()
	 */
	@Override
	public Seal clone() {
		// TODO Auto-generated method stub
		return new Seal();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.prototype.Beast#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Seal";
	}

}
