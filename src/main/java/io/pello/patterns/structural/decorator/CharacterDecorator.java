/**
 * 
 */
package io.pello.patterns.structural.decorator;

/**
 * @author Administrador
 *
 */
public class CharacterDecorator implements Character {

	protected Character extendedCharacter;
	
	/**
	 * 
	 * @param extendedCharacter
	 */
	public CharacterDecorator(Character extendedCharacter) {
		this.extendedCharacter = extendedCharacter;
	}
	
	/* 
	 * delegates move call 
	 * @see io.pello.patterns.structural.decorator.Character#move()
	 */
	public int move() {
		return extendedCharacter.move();
	}

	/* 
	 * delegates attack call 
	 * @see io.pello.patterns.structural.decorator.Character#attack()
	 */
	public int attack() {
		return extendedCharacter.attack();
	}

	/* 
	 * delegates defend call 
	/* (non-Javadoc)
	 * @see io.pello.patterns.structural.decorator.Character#defend()
	 */
	public int defend() {
		return extendedCharacter.defend();
	}

	/**
	 * toString method
	 */
	public String toString() {
		return extendedCharacter.toString();
	}

}
