/**
 * 
 */
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the landing
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class DragonLandState implements DragonState {

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#fly(io.pello.patterns.behavioral.state.Dragon)
	 */
	public void fly(Dragon dragon) {
		System.out.println("Land State> we are landing not flying...");
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#land(io.pello.patterns.behavioral.state.Dragon)
	 */
	public void land(Dragon dragon) {
		System.out.println("Land State> landing");
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.state.DragonState#attack(io.pello.patterns.behavioral.state.Dragon)
	 */
	public int attack(Dragon dragon) {
		System.out.println("Land State> can't attack while landing.");
		return 0;
	}

}
