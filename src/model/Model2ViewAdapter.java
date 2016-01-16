package model;

import dungeon.Room;

public interface Model2ViewAdapter {
	/**
	 * Test function to print to view console
	 * @param arg string to print
	 */
	public void printToViewConsole(String arg);

	public void drawRoom(Room currentRoom);
}
