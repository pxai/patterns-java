/**
 * 
 */
package io.pello.patterns.creational.builder;

/**
 * Example of builder client code
 * this will use the director to create one Hero
 * @author Pello Xabier Altadill Izura
 *
 */
public class BuilderClient {
	public Hero createHero () {
		HeroBuilder heroBuilder = new HumanHeroBuilder();
		Director director = new Director();
		
		// here we pass our builder, and an extra parameter.
		director.createHero(heroBuilder);
		
		
		return heroBuilder.getHero();
	}
}
