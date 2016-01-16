package dungeon;

import graphics.IGraphics;

public class Map {

	private ABlock[][] blocks;
	
	/**
	 * Constructor for Map.
	 */
	public Map() {
		
	}
	
	public IGraphics getGraphics() {
		for(int x = 0; x < blocks.length; x++) {
			for(int y = 0; y < blocks[x].length; y++) {
				// Draw this graphic at this location
				// IGraphics blockGraphic = blocks[x][y].getGraphics();
			}
		}
		return null;
	}
}
