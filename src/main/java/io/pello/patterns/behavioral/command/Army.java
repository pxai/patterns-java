package io.pello.patterns.behavioral.command;

/**
 * Represents an army
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Army {
	private int totalLife = 10;
	
	/**
	 * moves army somewhere
	 */
	public void move () {
		System.out.println("Army on the move");
	}
	
	/**
	 * army attacks
	 */
	public int attack () {
		System.out.println("Army attacking");
		return (int)Math.random() * 6;
	}

	/**
	 * army attacks
	 */
	public int defend () {
		System.out.println("Army defending");
		return (int)Math.random() * 6;
	}

	/**
	 * @return the totalLife
	 */
	public int getTotalLife() {
		return totalLife;
	}

	/**
	 * @param totalLife the totalLife to set
	 */
	public void setTotalLife(int totalLife) {
		this.totalLife = totalLife;
	}

}
