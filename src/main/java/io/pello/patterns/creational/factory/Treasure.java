/**
 * 
 */
package io.pello.patterns.creational.factory;

/**
 * @author Administrator
 *
 */
public abstract class Treasure {
	private String name;
	private int value;
	
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

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	public abstract String getType();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Treasure [name=" + name + ", value=" + value + "]";
	}

	
}
