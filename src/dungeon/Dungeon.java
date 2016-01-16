package dungeon;

import java.io.File;

public class Dungeon{

	private RoomCollection[] rooms;

  public Dungeon(int numRooms) {
    rooms = generateDungeon(numRooms);
  }

  private RoomCollection[] generateDungeon(int numRooms) {
    RoomCollection[] roomList = new RoomCollection[numRooms];
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
}
