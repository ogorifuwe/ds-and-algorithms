//import polygon.*;

class Solution {

  public static void print(Polygon p) {
    System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides.");
    System.out.println("The perimeter of this shape is: " + p.getPerimeter() + '\n');
  }

  public static void main(String[] args) {
    Polygon triangle = new Triangle(1, 2, 3);
    print(triangle); System.out.print("\n");

    Polygon rectangle = new Rectangle(2, 3);
    print(rectangle); System.out.print('\n');

    Polygon square = new Square(2);
    print(square); System.out.print('\n');
  }
}
