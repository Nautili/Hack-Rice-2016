package dungeon;

public class Dungeon {

	private RoomCollection[][] rooms;

  public Dungeon(int numRooms) {
    rooms = generateDungeon(numRooms);
  }

  private RoomCollection[][] generateDungeon(int numRooms) {
    return new RoomCollection[0][0];
  }
}
