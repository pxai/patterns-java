/**
 * 
 */
package io.pello.patterns.creational.factory;

/**
 * GoldCoin treasure kind
 * @author Pello Xabier Altadill Izura
 *
 */
public class GoldCoin extends Treasure {
	private int amount;
	
	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.factory.Treasure#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "GoldCoin";
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.factory.Treasure#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Amount: " + amount;
	}
	
	

}
