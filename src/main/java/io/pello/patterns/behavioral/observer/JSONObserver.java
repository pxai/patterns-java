/**
 * 
 */
package io.pello.patterns.behavioral.observer;

/**
 * Extends observer to give JSON output
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class JSONObserver extends Observer {

	/**
	 * constructor passing subject
	 * @param subject
	 */
	public JSONObserver(Subject subject) {
		super(subject);
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.observer.Observer#update()
	 */
	public void update() {
		observerState = "{\"data\" :\""+ subject.getState() + "\" }";
	}

}
