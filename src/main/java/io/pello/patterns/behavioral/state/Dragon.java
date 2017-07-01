/**
 * 
 */
package io.pello.patterns.behavioral.state;

/**
 * Represents a Dragon, a terrible creature that flies, attacks, smashes...
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Dragon {
	private DragonState dragonState;
	
	public Dragon () {
		this.dragonState = new DragonLandState();
	}
	
	/**
	 * make the dragon fly
	 */
	public void fly() {
		dragonState = new DragonFlyState();
		System.out.println("Dragon> let's fly");
		dragonState.fly(this);
	}

	/**
	 * make the dragon fly
	 */
	public void land() {
		dragonState = new DragonLandState();
		System.out.println("Dragon> let's land");
		dragonState.land(this);
	}

	/**
	 * make the dragon attack!!!
	 */
	public int attack() {
		dragonState = new DragonAttackState();
		System.out.println("Dragon> attack of the dragon");
		return dragonState.attack(this);
	}

}
