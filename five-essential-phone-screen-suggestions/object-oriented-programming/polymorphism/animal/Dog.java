class Dog extends Animal {

  private String name;

  public Dog(String name) {
    super(name);
  }
  
  public String sound() {
    return "woof woof";
  } 

  public String locomotion() {
    return "walks";
  }
}
