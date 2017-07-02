
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the flying
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */

public class DragonFlyState implements DragonState {

	public void fly(Dragon dragon) {
		System.out.println("Land State> attack while flying...");
	}

	public void land(Dragon dragon) {
		System.out.println("Land State> can't land.");
	}

	public int attack(Dragon dragon) {
		System.out.println("Land State> we attack while landing.");
		return (int) (Math.random() * 100);
	}
}
