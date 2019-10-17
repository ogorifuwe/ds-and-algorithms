/* first parent class */
class Parent1 {

  void fun() {
    System.out.println("Parent1");
  }
}

/* second parent class */
class Parent2 {

  void fun() {
    System.out.println("Parent 2");
  }
}

/* ERROR: Test is inheriting from multiple classes */
class Test extends Parent1, Parent2 {
  
  public static void main(String[] args) {
    Test t = new Test();
    t.fun();
  }
}
