/* Java program to illustrate delegation */
class RealPrinter {
  /* the delegate */
  void print() {
    System.out.println("The Delegate");
  }
}

class Printer {
  /* the delegator */
  RealPrinter pr = new RealPrinter();

  /* create the delegate */
  void print() {
    pr.print(); // delegation
  }
}

public class Tester {
  
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.print();
  }
}
