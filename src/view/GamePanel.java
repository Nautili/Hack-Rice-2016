package view;

import graphics.GraphicsCollection;
import graphics.IGraphics;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private IGraphics allGraphics;
	
	public GamePanel() {
		super();
		allGraphics = new GraphicsCollection();
	}
	
	public void setGraphics(IGraphics allGraphics) {
		this.allGraphics = allGraphics;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		allGraphics.draw(g);
	}
	
	
}
