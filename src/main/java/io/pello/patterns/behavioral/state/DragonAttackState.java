/**
 * 
 */
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the Attack
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class DragonAttackState implements DragonState {

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#fly(io.pello.patterns.behavioral.state.Dragon)
	 */
	public void fly(Dragon dragon) {
		System.out.println("Land State> fly while attacking");
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#land(io.pello.patterns.behavioral.state.Dragon)
	 */
	public void land(Dragon dragon) {
		System.out.println("Land State> can't attack while landing.");
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#attack(io.pello.patterns.behavioral.state.Dragon)
	 */
	public int attack(Dragon dragon) {
		System.out.println("Land State> can't attack while landing.");
		return (int) (Math.random() * 100);
	}

}
