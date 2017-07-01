/**
 * 
 */
package io.pello.patterns.structural.adapter;

import java.util.Vector;

/**
 * This class represents some kind of Inventory
 * but it does NOT implement that interface. So it must be used
 * with an adapter.
 * @author Pello Xabier Altadill Izura
 *
 */
public class Equipment extends Vector {
	
	/**
	 * adds element t
	 */
	public void addElement (Object object) {
		this.add(object);
	} 
	
	/**
	 * removes element from given position
	 * @param index
	 */
	public void delete (int index) {
		this.removeElementAt(index);
	}
}
