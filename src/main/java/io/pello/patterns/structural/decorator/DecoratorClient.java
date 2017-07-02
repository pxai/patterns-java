
package io.pello.patterns.structural.decorator;

/**
 * Makes use of decorated characters
 * @author Pello Xabier Altadill Izura
 *
 */
public class DecoratorClient {
	public void useCharacters () {
		Character hordeCharacter= new Orc(new SimpleCharacter("Thrall"));
		System.out.println(hordeCharacter.toString());
	}
}
