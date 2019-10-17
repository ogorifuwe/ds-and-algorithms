class Cat extends Animal {
  
  private String name;

  public Cat (String name) {
    super(name);
  }

  public String sound() {
    return "meow meow"; 
  }

  public String locomotion() {
    return "walks"
  }
}
