package entities;

import graphics.IGraphics;

public abstract class ABlock extends Entity {

	/**
	 * Constructor for Block
	 */
	public ABlock() {

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
