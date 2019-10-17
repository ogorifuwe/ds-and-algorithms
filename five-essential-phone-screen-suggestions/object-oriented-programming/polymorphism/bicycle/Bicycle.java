public class Bicycle {

  private int cadence;
  private int speed;
  private int gear;

  public Bicycle(int startCadence,
                  int startSpeed,
                  int startGear) {
    this.setGear(startGear);
    this.setCadence(startCadence);
    this.setSpeed(startSpeed);
  }

  public int getGear() { return this.gear; }
  public void setGear(int startGear) { 
    this.gear = startGear;
  }

  public int getCadence() { return this.cadence; }
  public void setCadence(int startCadence) { 
    this.cadence = startCadence;
  }

  public int getSpeed() { return this.speed; }
  public void setSpeed(int startSpeed) {
    this.speed = startSpeed;
  }

  public void printDescription() {
    System.out.println("\nBike is " +  "in gear " + this.gear
        + " with a cadence of " + this.cadence +
        " and travelling at a speed of " + this.speed + ". ");
  }
}
