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
	private String artworkLocation = "Artwork/";
	
	public TileGraphics() {
		position = new Point(0,0);
	}
	
	public TileGraphics(Point p, String tileName) {
		img = null;
		try {
		    img = ImageIO.read(new File(artworkLocation + tileName + ".png"));
		} catch (IOException e) {
		}
		position = p;

	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(img.getScaledInstance(img.getWidth()*4, img.getHeight()*4, Image.SCALE_DEFAULT), position.x, position.y, null);
	}
	
}
