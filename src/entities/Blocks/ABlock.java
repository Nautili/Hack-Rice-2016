package entities.Blocks;

import java.awt.Image;

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
		System.out.println(this.getClass().getCanonicalName().replace("entities.Blocks.", "").replace("Block", "").toLowerCase());
		  return new TileGraphics(getPosition(), this.getClass().getCanonicalName().replace("entities.Blocks.", "").replace("Block", "").toLowerCase());
	}

  public void update() {

  }
}

