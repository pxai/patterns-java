package io.pello.patterns.behavioral.command;

/**
 * AttackCommand
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class AttackCommand implements Command {

	private Army army;
	
	/**
	 * constructor
	 * @param army
	 */
	public AttackCommand(Army army) {
		this.army = army;
	}
	
	/**
	 * implementation of execution command
	 */
	public void execute() {
		System.out.println("AttackCommand: attack");
		army.attack();
	}
	
	/**
	 * implementation of the undo command
	 */
	public void undo() {
		System.out.println("AttackCommand: undo attack");
	}

}
