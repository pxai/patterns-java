/**
 * 
 */
package io.pello.patterns.behavioral.observer;

/**
 * Definition of observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class TextObserver extends Observer {

	/**
	 * constructor passing subject
	 * @param subject
	 */
	public TextObserver(Subject subject) {
		super(subject);
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.observer.Observer#update()
	 */
	public void update() {
		observerState = subject.getState();
	}

}
