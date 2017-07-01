/**
 * 
 */
package io.pello.patterns.behavioral.observer;

/**
 * Definition of observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Observer {
	protected String observerState;
	protected Subject subject;
	
	// This method will update view
	public abstract void update ();

	/**
	 * constructor passing subject
	 * @param subject
	 */
	public Observer (Subject subject) {
		this.subject = subject;
	}
	
	/**
	 * @return the observerState
	 */
	public String getObserverState() {
		return observerState;
	}

	/**
	 * @param observerState the observerState to set
	 */
	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}
}
