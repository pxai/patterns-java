/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.pello.patterns.creational.abstractfactory;

/**
 *
 * @author root
 */
public abstract class Weapon {
	protected String name;
	protected int type;
    public abstract int attackPoints ();
    public abstract int defensePoints ();
}
