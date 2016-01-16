package entities;

import java.awt.Point;

public class LocationInfo {

  private Point vel;
  private Point pos;

  public LocationInfo() {
    vel = new Point(0, 0);
    pos = new Point(0, 0);
  }

  public LocationInfo(Point vel, Point pos) {
    this.vel = vel;
    this.pos = pos;
  }

  public Point getVelocity() {
    return vel;
  }

  public Point getPosition() {
    return pos;
  }

  public void setVelocity(Point vel) {
    this.vel = vel;
  }

  public void setPosition(Point pos) {
    this.pos = pos;
  }
}
