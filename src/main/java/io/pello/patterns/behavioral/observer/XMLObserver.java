/**
 * 
 */
package io.pello.patterns.behavioral.observer;

/**
 * Extends observer to give XML output
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class XMLObserver extends Observer {

	/**
	 * constructor passing subject
	 * @param subject
	 */
	public XMLObserver(Subject subject) {
		super(subject);
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.behavioral.observer.Observer#update()
	 */
	public void update() {
		observerState = "<!xml version=\"1.0\"><data>"+ subject.getState() + "</data>";
	}

}
