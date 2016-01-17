package dungeon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import entities.Entity;
import entities.EntityCollection;
import entities.Player;
import entities.Blocks.ABlock;
import entities.Blocks.FloorBlock;
import entities.Blocks.PitBlock;
import entities.Blocks.PushBlock;
import entities.Blocks.WallBlock;

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
	 rooms = new Room[1];
	 rooms[0] = new Room(new Map(), null);
	 currentRoom = 0; 
  }

  private Room[] generateDungeon(int numRooms) {
    Room[] roomList = new Room[numRooms];
    //Get list of rooms to link together
    File roomDir = new File("roomFiles");
    File[] fileList = roomDir.listFiles();

    //randomly select values from roomList

    int numRoomsAdded = 0;
    
    for(File f : fileList) {
      //Load files 
      //Translate to usable format
    	try {
    		BufferedReader breader = new BufferedReader(new FileReader(f));
    		// First line tells the width / height of the room
    		
    		String[] dimensions = breader.readLine().split(" ");
    		int roomHeight = Integer.parseInt(dimensions[0]);
    		int roomWidth = Integer.parseInt(dimensions[1]);
    		
    		String line;
    		ABlock[][] blocks = new ABlock[roomHeight][roomWidth];
    		EntityCollection entities = new EntityCollection();
    		
    		for (int k = 0; k < roomHeight; k++) {
    		line = breader.readLine();   		
    		char[] charLine = line.toCharArray();
    		for(int i = 0; i < line.length(); i++)
    		{
    			switch(charLine[i]) {
    				case 0: blocks[k][i] = new FloorBlock(k, i);
    						break;
    				case 1: blocks[k][i] = new PitBlock(k, i);
    						break;
    				case 2: blocks[k][i] = new PushBlock(k, i);
    						break;
    				case 3: blocks[k][i] = new WallBlock(k, i);
    						break;
    				case 4: blocks[k][i] = new FloorBlock(k, i);
    						entities.add(new Player(k,i));
    				default: break;	
    			}
    		}
    			
    	}
    	
        //add to room list    	
    	roomList[numRoomsAdded] = new Room(new Map(blocks), entities);
    	numRoomsAdded++;
    	System.out.println("Added room " + numRoomsAdded);
    }catch (IOException i) {
    	
    }
    	}
    
   
    

    return roomList;
  }
  
  public Room getCurrentRoom() {
	  return rooms[currentRoom];
  }
}
