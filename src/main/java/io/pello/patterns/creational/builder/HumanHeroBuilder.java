/**
 * 
 */
package io.pello.patterns.creational.builder;

import io.pello.patterns.creational.abstractfactory.HumanWeapon;
import io.pello.patterns.creational.abstractfactory.Weapon;

/**
 * @author Administrator
 *
 */
public class HumanHeroBuilder extends HeroBuilder {

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#createHero()
	 */
	@Override
	public void createHero() {
		this.hero = new Hero();
		hero.setRace("human");

	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#buildArmor()
	 */
	@Override
	public void buildArmor() {
		Armor armor = new Armor();
		armor.setName("Human armor");
		armor.setDefense(3);
		armor.setValue(100);
		
		hero.setArmor(armor);
	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#buildSpell()
	 */
	@Override
	public void buildSpell() {
		Spell spell = new Spell();
		spell.setName("Heal");
		spell.setMana(20);
		
		hero.setSpell(spell);

	}

	/* (non-Javadoc)
	 * @see io.pello.patterns.creational.builder.HeroBuilder#buildWeapon()
	 */
	@Override
	public void buildWeapon() {
		Weapon weapon = new HumanWeapon();
		
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
