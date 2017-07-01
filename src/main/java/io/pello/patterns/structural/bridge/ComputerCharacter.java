package io.pello.patterns.structural.bridge;

/**
 * Represents computer character
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class ComputerCharacter extends Character {
	private String tribe;
	
	/**
	 * Constructor
	 * @param asignationMethod
	 * @param name
	 */
	protected ComputerCharacter(Assignation assignationMethod, String tribe) {
		super(assignationMethod);
		this.tribe = tribe;
	}

	/**
	 * generate and assign character attributes.
	 * We add 1, just in case.
	 */
	@Override
	public void generateCharacter() {
		int[] values = assignationMethod.generateValues();
		setStrength(values[0] + 1);
		setSpeed(values[1] + 1);
		setIntelligence(values[2] + 1);
	}

	/**
	 * @return the tribe
	 */
	public String getTribe() {
		return tribe;
	}

	/**
	 * @param tribe the tribe to set
	 */
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

}
