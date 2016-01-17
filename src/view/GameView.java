package view;

import graphics.IGraphics;

import java.awt.Graphics;

import javax.swing.JPanel;

import dungeon.Room;

public class GameView extends JPanel {
	/**
	 * The View to Model Adapter for this View
	 */
	private View2ModelAdapter mainAdapter;
	
	private IGraphics allGraphics;
	
	/**
	 * Constructor this GameView
	 * @param mainAdapter The View to Model Adapter for this View
	 */
	public GameView(View2ModelAdapter mainAdapter){
		this.mainAdapter = mainAdapter;
	}
	/**
	 * Starts the Game View
	 */
	public void start(){
		
	}
	/**
	 * Test function to print string to console
	 * @param arg the string to print
	 */
	public void printToConsole(String arg){
		System.out.println(arg);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		allGraphics.draw(g);
	}
	
	public void drawRoom(Room r) {
		// Draw room, given graphics
		allGraphics = r.getGraphics();
		repaint();
	}
}
