
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the Attack
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class DragonAttackState implements DragonState {

	public void fly(Dragon dragon) {
		System.out.println("Land State> fly while attacking");
	}

	public void land(Dragon dragon) {
		System.out.println("Land State> can't attack while landing.");
	}

	public int attack(Dragon dragon) {
		System.out.println("Land State> can't attack while landing.");
		return (int) (Math.random() * 100);
	}
}
