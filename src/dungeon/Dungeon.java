package dungeon;

import java.io.File;

public class Dungeon{

	// Should be Room[] not RoomCollection[]
	private Room[] rooms;
	
	// Current room
	private int currentRoom;

  public Dungeon(int numRooms) {
    rooms = generateDungeon(numRooms);
    if(numRooms > 0) {
    	currentRoom = 0;
    }
  }
  
  /**
   * Test constructor
   */
  public Dungeon() {
	  // For testing purposes. Create a room 
	 rooms[0] = new Room(new Map(), null);
	 currentRoom = 0; 
  }

  private Room[] generateDungeon(int numRooms) {
    Room[] roomList = new Room[numRooms];
    //Get list of rooms to link together
    File roomDir = new File("roomFiles");
    File[] fileList = roomDir.listFiles();

    //randomly select values from roomList

    for(File f : fileList) {
      //Load files
      //Translate to usable format
      //add to room list
    }

    return roomList;
  }
  
  public Room getCurrentRoom() {
	  return rooms[currentRoom];
  }
}
