/**
 * 
 */
package io.pello.patterns.structural.adapter;

/**
 * Represents a generic Item
 * @author Pello Xabier Altadill Izura
 *
 */
public class Item {
	private String name;

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}
	
	
}
