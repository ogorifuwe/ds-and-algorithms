class RealPrinter {
  /* the delegate */
  void print() {
    System.out.println("The Delegate");
  }
}

class Printer {
  /* the delegator */
  RealPrinter rp = new RealPrinter();

  /* create the delegate */
  void print() {
    rp.print(); // delegation
  }
}

class Tester1 {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.print();
  }  
}
