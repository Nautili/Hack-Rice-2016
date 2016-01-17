package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import graphics.IGraphics;
import javax.swing.JFrame;

import dungeon.Room;

public class GameView implements KeyListener{
	/**
	 * The View to Model Adapter for this View
	 */	
	private View2ModelAdapter mainAdapter;
	
	private JFrame gameFrame;
	
	private GamePanel gamePanel;
	
	
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
		gameFrame = new JFrame("Tri-Cheese");
		gamePanel = new GamePanel();
		gameFrame.add(gamePanel);
		gameFrame.setSize(300,300);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
	}
	
	/**
	 * Test function to print string to console
	 * @param arg the string to print
	 */
	public void printToConsole(String arg){
		System.out.println(arg);
	}
		
	public void drawRoom(Room r) {
		// Draw room, given graphics
		gamePanel.setGraphics(r.getGraphics());
		gamePanel.repaint();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			gamePanel.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			gamePanel.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			gamePanel.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			gamePanel.repaint();
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
