package entities;

import graphics.IGraphics;

//Interface for the main character
public interface IEntity{

  public void update();
  
  public IGraphics getGraphics();

}
