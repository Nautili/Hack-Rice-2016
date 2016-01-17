package entities.Blocks;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import entities.Blocks.ABlock;
import graphics.IGraphics;
import graphics.TileGraphics;

public class FloorBlock extends ABlock {


  public FloorBlock() {
	  super();
  }
  
  public FloorBlock(int x, int y) {
	  super(x, y);
  }

}
