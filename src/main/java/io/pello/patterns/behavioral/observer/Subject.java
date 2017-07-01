/**
 * 
 */
package io.pello.patterns.behavioral.observer;

import java.util.Vector;

/**
 * Definition of generic Subject in observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Subject {
	private Vector<Observer> observers;
	
	public abstract String getState();
	
	/**
	 * adds an observer to vector
	 * @param observer
	 */
	public void attach (Observer observer) {
		observers.add(observer);
	}

	/**
	 * removes an observer from vector
	 * @param observer
	 */
	public void dettach (Observer observer) {
		observers.remove(observer);
	}

	/**
	 * notifies observes about changes 
	 */
	public void notifyObservers () {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
