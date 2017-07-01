/**
 * 
 */
package io.pello.patterns.creational.abstractfactory;

/**
 * @author Administrator
 *
 */
public class HumanElementFactory extends GameElementFactory {

	/* (non-Javadoc)
	 * @see io.pello.patterns.abstractfactory.GameElementFactory#createCharacter()
	 */
	@Override
	public Character createCharacter() {
		// TODO Auto-generated method stub
		return new HumanCharacter();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.abstractfactory.GameElementFactory#createWarrior()
	 */
	@Override
	public Building createBuilding() {
		// TODO Auto-generated method stub
		return new HumanBuilding();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.abstractfactory.GameElementFactory#createWeapon()
	 */
	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new HumanWeapon();
	}

}
