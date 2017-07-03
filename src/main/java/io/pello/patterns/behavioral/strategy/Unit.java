package io.pello.patterns.behavioral.strategy;

/**
 * This class will be able to use different strategies to assing values
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Unit {
	private int strength;
	private int speed;
	private int intelligence;
	private PointsGenerator pointsGenerator;
	
	public Unit (PointsGenerator pointsGenerator) {
		this.pointsGenerator = pointsGenerator;
		init();
	}
	
	 // this method makes use of the strategy
	private void init() {
		int [] values = pointsGenerator.generate();
		strength = values[0];
		speed = values[1];
		intelligence = values[2];
	}

	@Override
	public String toString() {
		return "Unit [strength=" + strength + ", speed=" + speed
				+ ", intelligence=" + intelligence + "]";
	}
}
