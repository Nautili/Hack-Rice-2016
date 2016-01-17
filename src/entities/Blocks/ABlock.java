package entities.Blocks;

import entities.Entity;
import graphics.IGraphics;

public abstract class ABlock extends Entity {

	/**
	 * Constructor for Block
	 */
	public ABlock() {
		super();
	}

	/**
	 * Get block graphics.
	 * @return IGraphics block graphics
	 */
	public IGraphics getGraphics()
	{
		return null;
	}

  public void update() {

  }
}

