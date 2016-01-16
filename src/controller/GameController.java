package controller;

import dungeon.Room;
import model.GameModel;
import model.Model2ViewAdapter;
import view.GameView;
import view.View2ModelAdapter;

public class GameController {

	/**
	 * The GameView this GameController uses
	 */
	private GameView view;
	/**
	 * The GameModel this GameController uses
	 */
	private GameModel model;
	/**
	 * Constructor for the GameController
	 */
	public GameController(){
		//Game view declaration
		this.view = new GameView(new View2ModelAdapter(){
			
		});
		
		//Game model declaration
		this.model = new GameModel(new Model2ViewAdapter(){

			@Override
			public void printToViewConsole(String arg) {
				view.printToConsole(arg);
				
			}

			@Override
			public void drawRoom(Room currentRoom) {
				view.drawRoom(currentRoom);
				
			}
			
		});
	}
	/**
	 * Starts the game controller
	 */
	public void start(){
		view.start();
		model.start();
	}
	
	public static void main(String[] args){
		GameController game = new GameController();
		game.start();
	}
}


