/**.
 * This is a collection of methods we expect and require
 * a polygon to have 
**/
//package polygon;

interface Polygon {
  
  /** @return The number of sides of the polygon **/
  int getNumberOfSides();

  /** @return The perimeter of the polygon **/
  double getPerimeter();
}

class Triangle implements Polygon {
  private static int numberOfSides = 3;
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1; this.side2 = side2; this.side2 = side3;
  }

  public int getNumberOfSides() {
    return numberOfSides;
  }

  public double getPerimeter() {
    return side1 + side2 + side3;
  }
}

class Rectangle implements Polygon {
  private static int numberOfSides = 4;
  private double side1;
  private double side2;

  public Rectangle(double side1, double side2) {
    this.side1 = side1; this.side2 = side2;
  }

  public int getNumberOfSides() {
    return numberOfSides;
  }

  public double getPerimeter() {
    return side1 + side1 + side2 + side2;
  }
}

class Square extends Rectangle implements Polygon {
  public Square(double side) {
    super(side, side);
  }
}
