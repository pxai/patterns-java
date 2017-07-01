package io.pello.patterns.structural.bridge;

/**
 * Represents game character
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Character {
	protected Assignation assignationMethod;
	private int strength;
	private int speed;
	private int intelligence;
	
	/**
	 * constructor, initialized with the asignation instance
	 * @param asignationMethod
	 */
	protected Character (Assignation assignationMethod) {
		this.assignationMethod = assignationMethod;
	}
	
	public abstract void generateCharacter ();
	
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
}
