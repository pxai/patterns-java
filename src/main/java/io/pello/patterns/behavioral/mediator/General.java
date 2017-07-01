package io.pello.patterns.behavioral.mediator;

/**
 * Represent a General
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class General extends Unit {
	
	/**
	 * Constructor
	 * @param name
	 * @param range
	 */
	public General(String name, String range, MediatorInterface mediator) {
		super(name, range, mediator);
	}

	/**
	 * Gives an order to unit...
	 * @param msg
	 */
	public void giveOrder (Command command, Unit unit) {
		System.out.println("Giving order> " + command.getMsg());
		mediator.order(command, unit);
	}
}
