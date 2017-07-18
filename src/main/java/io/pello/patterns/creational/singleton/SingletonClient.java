
package io.pello.patterns.creational.singleton;

/**
 * A client using the die
 * 
 * @author Pello Xabier Altadill Izura
 */
public class SingletonClient {

	public void rollDie() {
		System.out.println("Let's roll the die");

		for (int i = 0; i < 10; i++) {
			System.out.println(Die.getInstance().roll());
		}
	}

	public static void main(String args[]) {
		new SingletonClient().rollDie();
	}
}
