package io.pello.patterns.behavioral.memento;

import io.pello.patterns.creational.abstractfactory.HumanWeapon;

/**
 * Represents a unit of an army
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class UnitOriginator {
	private String name;
	private int life;
	private String range;
	private HumanWeapon weapon;
	private State state;
	
	public UnitOriginator(String name, int life, String range, HumanWeapon weapon) {
		this.name = name;
		this.life = life;
		this.range = range;
		this.weapon = weapon;
	}


	public void setUnitMemento (UnitMemento unitMemento) {
		this.state = unitMemento.getState();
	}
	
	public UnitMemento createMemento () {
		State state = new State();
		
		state.setLife(this.life);
		state.setRange(this.range);
		state.setWeapon(this.weapon);
		
		UnitMemento memento = new UnitMemento();
		memento.saveState(state);
		
		return memento;
	}
	
	// getters/setters...

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public HumanWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(HumanWeapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "UnitOriginator [name=" + name + ", life=" + life + ", weapon="
				+ weapon + "]";
	}
}
