package entities.Blocks;

import entities.Entity;
import graphics.IGraphics;
import graphics.TileGraphics;

public abstract class ABlock extends Entity {

	/**
	 * Constructor for Block
	 */
	public ABlock() {
		super();
	}
	
	public ABlock(int x, int y) {
		super(x, y);
	}

	/**
	 * Get block graphics.
	 * @return IGraphics block graphics
	 */
	public IGraphics getGraphics()
	{
		  return new TileGraphics(getPosition());
	}

  public void update() {

  }
}

