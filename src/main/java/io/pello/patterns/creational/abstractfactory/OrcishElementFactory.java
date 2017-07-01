/**
 * 
 */
package io.pello.patterns.creational.abstractfactory;

/**
 * @author Administrator
 *
 */
public class OrcishElementFactory extends GameElementFactory {

	/* (non-Javadoc)
	 * @see io.pello.patterns.abstractfactory.GameElementFactory#createCharacter()
	 */
	@Override
	public Character createCharacter() {
		// TODO Auto-generated method stub
		return new OrcishCharacter();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.abstractfactory.GameElementFactory#createBuilding()
	 */
	@Override
	public Building createBuilding() {
		// TODO Auto-generated method stub
		return new OrcishBuilding();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.abstractfactory.GameElementFactory#createWeapon()
	 */
	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new OrcishWeapon();
	}

}
