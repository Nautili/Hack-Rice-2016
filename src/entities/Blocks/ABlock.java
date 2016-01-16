package entities;

import graphics.IGraphics;

public abstract class ABlock implements IEntity {

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
