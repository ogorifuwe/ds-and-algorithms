class Person {
  
  private int age;

  public Person(int initialAge) {
    if (!(initialAge < 0)) {
        age = initialAge; 
    } else {
      age = 0;
      System.out.print("Age is not valid, setting age to 0.\n");
    }
  }

  public void amIOld() {
    if (age < 13) { System.out.print("You are young.\n"); }
    else if (age >= 13 && age < 18) { System.out.print("You are a teenager.\n"); }
    else { System.out.print("You are old."); }
    System.out.print();
  }

  public void yearPasses() {
    ++age;
  }
}
