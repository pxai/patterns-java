/**
 * 
 */
package io.pello.patterns.structural.decorator;

/**
 * Represents orc character
 * @author Pello Xabier Altadill Izura
 *
 */
public class Orc extends CharacterDecorator {
	private static final int ORCISH_MODIFIER = 3;
	
	/**
	 * constructor with character parameter
	 * @param extendedCharacter
	 */
	public Orc (Character extendedCharacter) {
		super(extendedCharacter);
	}
	
	/**
	 * generates a number for orcish rolls
	 * @return
	 */
	private int orcModifier () {
		return (int) ((Math.random() * ORCISH_MODIFIER) + ORCISH_MODIFIER);
	}
	
	/* (non-Javadoc)
	 * @see io.pello.patterns.structural.decorator.Character#move()
	 */
	@Override
	public int move() {
		return orcModifier() + super.move();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.structural.decorator.Character#attack()
	 */
	@Override
	public int attack() {
		return orcModifier() + super.attack();
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.structural.decorator.Character#defend()
	 */
	@Override
	public int defend() {
		return orcModifier() + super.defend();
	}

	@Override
	public String toString() {
		return super.toString() + " and I'm an orcish character";
	}
}
