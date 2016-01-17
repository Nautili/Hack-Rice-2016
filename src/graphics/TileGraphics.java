package graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TileGraphics implements IGraphics {

	private BufferedImage img;
	private Point position;
	
	public TileGraphics() {
		position = new Point(0,0);
	}
	
	public TileGraphics(Point p) {
		img = null;
		try {
		    img = ImageIO.read(new File("floor.png"));
		} catch (IOException e) {
		}
		
		position = p;
	

	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(img, position.x, position.y, null);
	}
	
}
