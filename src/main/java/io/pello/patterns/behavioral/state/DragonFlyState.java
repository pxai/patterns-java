/**
 * 
 */
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the flying
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */

public class DragonFlyState implements DragonState {

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#fly(io.pello.patterns.behavioral.state.Dragon)
	 */
	public void fly(Dragon dragon) {
		System.out.println("Land State> attack while flying...");
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#land(io.pello.patterns.behavioral.state.Dragon)
	 */
	public void land(Dragon dragon) {
		System.out.println("Land State> can't land.");
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#attack(io.pello.patterns.behavioral.state.Dragon)
	 */
	public int attack(Dragon dragon) {
		System.out.println("Land State> we attack while landing.");
		return (int) (Math.random() * 100);
	}

}
