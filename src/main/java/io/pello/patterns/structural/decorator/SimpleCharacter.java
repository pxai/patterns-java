/**
 * 
 */
package io.pello.patterns.structural.decorator;

/**
 * @author Administrador
 *
 */
public class SimpleCharacter implements Character {
	private String name;

	/**
	 * constructor with name
	 * @param name
	 */
	public SimpleCharacter (String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see io.pello.patterns.structural.decorator.Character#move()
	 */
	public int move() {
		return 3;
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.structural.decorator.Character#attack()
	 */
	public int attack() {
		return 3;
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.structural.decorator.Character#defend()
	 */
	public int defend() {
		return 3;
	}

	/**
	 * String info for simple character
	 */
	public String toString() {
		return "Simplest character. Name: " + name;
	}
}
