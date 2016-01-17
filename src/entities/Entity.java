package entities;

import java.awt.Point;

//Interface for the main character
public class Entity {

  private LocationInfo locationInfo;

  public Entity() {
	  locationInfo = new LocationInfo();
  }
  
  public Point getPosition()
  {
	  return locationInfo.getPosition();
  }

}
