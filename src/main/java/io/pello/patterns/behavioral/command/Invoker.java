package io.pello.patterns.behavioral.command;

import java.util.Vector;

/**
 * Invoker, invoke every command storing them in a structure
 * to allow undo operations. I'm using a Vector here but could
 * be also a Stack
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Invoker {
	private Vector<Command> commandHistory = new Vector<Command>();
	private int undoIndex = 0;
	
	/**
	 * stores new command in commandHistory and executes it
	 * When a new command is executed, undoIndex will point to the
	 * last command.
	 * @param command
	 */
	public void storeAndExecute (Command command) {
		commandHistory.add(command);
		undoIndex = commandHistory.size() - 1;
		command.execute();
	}
	
	/**
	 * undos last command
	 */
	public void undo () {
		if (undoIndex >= 0 && undoIndex <= commandHistory.size() -1 ) {
			commandHistory.get(undoIndex).undo();
			if (undoIndex > 0) { undoIndex--; }
		}
	}
}
