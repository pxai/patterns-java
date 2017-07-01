/**
 * 
 */
package io.pello.patterns.creational.prototype;

/**
 * Factory of beasts using clone
 * @author Pello Xabier Altadill Izura
 * in GoF sample instances of beast are passed
 * to the constructor. Here they are created there.
 */
public class BeastPrototypeFactory {
	private Boar boar;
	private Sheep sheep;
	private Seal seal;
	
	/**
	 * Constructor
	 */
	public BeastPrototypeFactory () {
		boar = new Boar();
		seal = new Seal();
		sheep = new Sheep();
	}
	
	/**
	 * clones a boar
	 * @return
	 */
	public Boar createBoar () {
		return boar.clone();
	}
	
	/**
	 * clones a sheep
	 * @return
	 */
	public Sheep createSheep () {
		return sheep.clone();
	}
	
	/**
	 * clones a seal
	 * @return
	 */
	public Seal createSeal () {
		return seal.clone();
	}
}
