/**
 * 
 */
package io.pello.patterns.creational.factory;

/**
 * Diamond treasure kind
 * @author Pello Xabier Altadill Izura
 *
 */
public class Diamond extends Treasure {
	private int mana;
	
	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.factory.Treasure#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Diamond";
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.factory.Treasure#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Mana: " + mana;
	}
	
	

}
