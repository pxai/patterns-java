package io.pello.patterns.structural.bridge;

/**
 * Represents human character
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class PlayerCharacter extends Character {
	private String name;
	
	/**
	 * Constructor
	 * @param asignationMethod
	 * @param name
	 */
	protected PlayerCharacter(Assignation assignationMethod, String name) {
		super(assignationMethod);
		this.name = name;
	}

	/**
	 * generate and assign character attributes.
	 */
	@Override
	public void generateCharacter() {
		int[] values = assignationMethod.generateValues();
		setStrength(values[0]);
		setSpeed(values[1]);
		setIntelligence(values[2]);
	}

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

}
