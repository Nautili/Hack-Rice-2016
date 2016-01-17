package dungeon;

import entities.EntityCollection;
import graphics.GraphicsCollection;
import graphics.IGraphics;

public class Room {

	private Map map;
	private EntityCollection entities;
	/**
	 * Constructor for Room.
	 */
	public Room() {
		
	}
	
	/**
	 * Test constructor
	 * @param map
	 * @param entities
	 */
	public Room(Map map, EntityCollection entities) {
		this.map = map;
		this.entities = entities;
	}
	public IGraphics getGraphics() {
		// get graphics from map (blocks) and from entities
		//GraphicsCollection mapGraphics = new GraphicsCollection();
		//mapGraphics.add(map.getGraphics());
		//mapGraphics.add(entities.getGraphics());
		return map.getGraphics();
	}
}
