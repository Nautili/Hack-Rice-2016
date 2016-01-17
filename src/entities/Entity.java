package entities;

import java.awt.Point;

//Interface for the main character
public class Entity {

/** 
 * Changed to protected so player location could be set.
 */
  protected LocationInfo locationInfo;

  public Entity() {
	  locationInfo = new LocationInfo();
  }
  
  /** Constructor with x and y position.
   * 
   * @param x
   * @param y
   */
  public Entity(int x, int y) {
	  locationInfo = new LocationInfo(new Point(0,0), new Point(x,y));
  }
  
  public Point getPosition()
  {
	  return locationInfo.getPosition();
  }
  

}
