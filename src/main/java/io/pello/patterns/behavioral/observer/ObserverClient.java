/**
 * 
 */
package io.pello.patterns.behavioral.observer;

/**
 * Simple client class to make use of Observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class ObserverClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PlayerSubject player = new PlayerSubject();
		Observer stringObserver = new TextObserver(player);
		Observer xmlObserver = new XMLObserver(player);
		Observer jsonObserver = new JSONObserver(player);
		
		player.attach(stringObserver);
		player.attach(xmlObserver);
		player.attach(jsonObserver);

		System.out.println("Before change: " + stringObserver.getObserverState());
		
		player.setState("Player data changed");

		System.out.println("After change: " + stringObserver.getObserverState());
		
		xmlObserver.setObserverState("Changed from xml observer");

		System.out.println("After 2nd change: " + stringObserver.getObserverState());

	}

}
