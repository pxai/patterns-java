/**
 * 
 */
package io.pello.patterns.creational.builder;

import io.pello.patterns.creational.abstractfactory.HumanWeapon;
import io.pello.patterns.creational.abstractfactory.OrcishWeapon;
import io.pello.patterns.creational.abstractfactory.Weapon;

/**
 * Builder for orcish hero
 * @author Pello Xabier Altadill Izura
 *
 */
public class OrcishHeroBuilder extends HeroBuilder {

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#createHero()
	 */
	@Override
	public void createHero() {
		this.hero = new Hero();
		hero.setRace("orc");

	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#buildArmor()
	 */
	@Override
	public void buildArmor() {
		Armor armor = new Armor();
		armor.setName("Human armor");
		armor.setDefense(5);
		armor.setValue(150);
		
		hero.setArmor(armor);
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#buildSpell()
	 */
	@Override
	public void buildSpell() {
		Spell spell = new Spell();
		spell.setName("Fireball");
		spell.setMana(10);
		
		hero.setSpell(spell);

	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#buildWeapon()
	 */
	@Override
	public void buildWeapon() {
		Weapon weapon = new OrcishWeapon();
		
		hero.setWeapon(weapon);
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#getHero()
	 */
	@Override
	public Hero getHero() {
		// TODO Auto-generated method stub
		return hero;
	}

}
