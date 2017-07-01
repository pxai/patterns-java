package io.pello.patterns.behavioral.mediator;

/**
 * Represent a single soldier
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Soldier extends Unit {
	
	/**
	 * Constructor
	 * @param name
	 * @param range
	 */
	public Soldier(String name, String range, MediatorInterface mediator) {
		super(name, range, mediator);
	}

	/**
	 * Unit receives an order...
	 * @param msg
	 */
	@Override
	public void receiveOrder (Command command) {
		System.out.println("Order received> " + command.getMsg());
	}
}
