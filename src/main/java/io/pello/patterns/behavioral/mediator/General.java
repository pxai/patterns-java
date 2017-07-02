package io.pello.patterns.behavioral.mediator;

/**
 * Represent a General
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class General extends Unit {
	
	public General(String name, String range, Mediator mediator) {
		super(name, range, mediator);
	}

	public void giveOrder (Command command, Unit unit) {
		System.out.println("Giving order> " + command.getMsg());
		mediator.order(command, unit);
	}
}
