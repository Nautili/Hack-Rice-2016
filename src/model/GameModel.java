package model;

import dungeon.Dungeon;

public class GameModel {
	/**
	 * The Model to View adapter for this model
	 */
	private Model2ViewAdapter mainAdapter;

	/**
	 * Contructor for the Game Model
	 * @param mainAdapter The Model to View adapter for this model
	 */
	public GameModel(Model2ViewAdapter mainAdapter){
		this.mainAdapter=mainAdapter;
	}
	/**
	 * Starts the Game Model
	 */
	public void start(){
		printToViewConsole("Hello World!");
		// Create test dungeon with 1 room
		Dungeon d = new Dungeon();
		// Draw that room
		mainAdapter.drawRoom(d.getCurrentRoom());
	}

	public void printToViewConsole(String arg){
		mainAdapter.printToViewConsole(arg);
	}
}
