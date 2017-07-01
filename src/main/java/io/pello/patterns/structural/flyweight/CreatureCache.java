package io.pello.patterns.structural.flyweight;

import java.util.Hashtable;
import java.util.Map;

/**
 * This is a cache to keep common data for flyweight instances
 * It's a singleton to ensure that there will be just one cache
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class CreatureCache {
	private static CreatureCache creatureCache;
	private static Map<String,CreatureAttributes> creatures = new Hashtable<String,CreatureAttributes> ();
	
	/**
	 * constructor
	 */
	private CreatureCache () {
		init();
	}
	
	/**
	 * inits simple creature cache.
	 * sorry for the magic numbers.
	 */
	private void init () {
		creatures.put("bat", new CreatureAttributes(6,5,3));
		creatures.put("snake", new CreatureAttributes(4,3,2));
		creatures.put("rat", new CreatureAttributes(5,6,3));
	}
	
	/**
	 * this method returns the cache
	 * @return
	 */
	public static CreatureCache getInstance () {
		if (null == creatureCache) {
			creatureCache = new CreatureCache();
		}
		
		return creatureCache;
	}

	/**
	 * returns attributes instance for given creature
	 * @param name
	 * @return
	 */
	public CreatureAttributes getCreatureAttributes (String name) {
		return creatures.get(name);
	}
}
