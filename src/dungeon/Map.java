package dungeon;

import entities.Blocks.ABlock;
import entities.Blocks.FloorBlock;
import graphics.GraphicsCollection;
import graphics.IGraphics;

public class Map {

	private ABlock[][] blocks;
	
	/**
	 * Generic constructor for Map.  Will create map with one floor block.
	 */
	public Map() {
		// Set size to 1
		blocks = new ABlock[1][1];
		// Floor block
		blocks[0][0] = new FloorBlock();
	}
	
	public IGraphics getGraphics() {
		GraphicsCollection blockGraphics = new GraphicsCollection();
		for(int x = 0; x < blocks.length; x++) {
			for(int y = 0; y < blocks[x].length; y++) {
				blockGraphics.add(blocks[x][y].getGraphics());
			}
		}
		return blockGraphics;
	}
}
