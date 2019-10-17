/* The diamond problem */
public class GrandParent {

  void fun() {
    System.out.println("Grandparent");
  }
}

/* first parent */
public class Parent1 {
  
  void fun() {
    System.out.println("Parent1");
  }
}

/* second parent */
public class Parent2 {
  
  void fun() {
    System.out.println("Parent2");
  }
}

/*ERROR: Test is inheriting from multiple classes */
class Test extends Parent1, Parent2 {

  public static void main(String[] args) {
    Test t = new Test();
    t.fun();
  }
}
