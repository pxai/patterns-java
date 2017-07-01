/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.pello.patterns.creational.abstractfactory;

/**
 *
 * @author root
 */
public abstract class Building {
	protected int type;
	protected int armor;
    public abstract void build ();
    public abstract void destroy();
    public abstract void upgrade();
    public abstract String toString();
}
