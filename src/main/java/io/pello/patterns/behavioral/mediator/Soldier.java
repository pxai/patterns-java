package io.pello.patterns.behavioral.mediator;

/**
 * Represent a single soldier
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Soldier extends Unit {

	public Soldier(String name, String range, Mediator mediator) {
		super(name, range, mediator);
	}

	@Override
	public void receiveOrder (Command command) {
		System.out.println("Order received> " + command.getMsg());
	}
}
