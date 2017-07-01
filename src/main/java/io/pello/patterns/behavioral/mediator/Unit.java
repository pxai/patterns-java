package io.pello.patterns.behavioral.mediator;

import io.pello.patterns.creational.singleton.Die;
/**
 * Represent a unit in the army
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Unit {
	protected String name;
	protected String range;
	private int x;
	private int y;
	protected MediatorInterface mediator;
	
	/**
	 * @param name
	 * @param range
	 */
	public Unit(String name, String range, MediatorInterface mediator) {
		this.name = name;
		this.range = range;
		x = y = 0;
		this.mediator = mediator;
	}
	
	/**
	 * receives orders..
	 * @param command
	 */
	public void receiveOrder (Command command) {
		System.out.println("Order received> " + command.getMsg());
	}
	
	/**
	 * moves
	 * @return
	 */
	public void move (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * attacks
	 * @return
	 */
	public int attack () {
		return Die.getInstance().roll();
	}
	
	/**
	 * holds position
	 */
	public void hold () {
		x = y = 0;
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
	
	/**
	 * @return the range
	 */
	public String getRange() {
		return range;
	}
	/**
	 * @param range the range to set
	 */
	public void setRange(String range) {
		this.range = range;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
}
