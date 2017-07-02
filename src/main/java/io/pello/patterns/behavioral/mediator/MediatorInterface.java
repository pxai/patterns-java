/**
 * 
 */
package io.pello.patterns.behavioral.mediator;

/**
 * Interface that defines contract for unit to interact between them
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public interface MediatorInterface {
	public void order (Command command, Unit unit);
	public void move (int x, int y);
	public int attack (int x, int y);
	public void hold ();
}