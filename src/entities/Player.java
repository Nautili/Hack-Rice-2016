package entities;

import graphics.IGraphics;
import movement.PlayerMovement;

//Main player class
public class Player extends Entity {
  private PlayerMovement playMove;

  public Player() {
    playMove = new PlayerMovement();
  }

  public void update() {
    playMove.update(this);
  }

  public IGraphics getGraphics() {
  	return null;
  }
}
