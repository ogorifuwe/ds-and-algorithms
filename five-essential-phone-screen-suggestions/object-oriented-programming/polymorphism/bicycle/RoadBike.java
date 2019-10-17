public class RoadBike extends Bicycle {

  // in millimeters (mm)
  public int tireWidth;

  public RoadBike(int startCadance,
                  int startSpeed,
                  int startGear,
                  int newTireWidth) {
                  
    super(startCadance,
          startSpeed,
          startGear);
    this.tireWidth = newTireWidth;
  }

  public int getTireWidth() { return this.tireWidth; }
  public void setTireWidth(int newTireWidth) {
    this.tireWidth = newTireWidth;
  }

  public void printDescription() {
    super.printDescription();
    System.out.println("The RoadBike" + " has " + getTireWidth()
        + " MM tires.");
  }
}
