/**
 * 
 */
package io.pello.patterns.creational.prototype;

/**
 * The wild boar of the forest...
 * @author Pello Xabier Altadill Izura
 *
 */
public class Boar extends BeastPrototype {

	private static final int BOAR_DEFENSE = 5;
	private static final int BOAR_MANA = 5;

	/**
	 * constructor
	 */
	public Boar () {
		defense = BOAR_DEFENSE;
		mana = BOAR_MANA;
	}
	
	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.prototype.Beast#clone()
	 */
	@Override
	public Boar clone() {
		// TODO Auto-generated method stub
		return new Boar();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.prototype.Beast#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Boar";
	}

}
