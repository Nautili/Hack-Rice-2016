package movement;

import entities.Entity;

public class PlayerMovement implements IMovement {

  public PlayerMovement() {

  }

  public void update(Entity entity) {
    entity.getLocationInfo().updatePosition();
  }
}
