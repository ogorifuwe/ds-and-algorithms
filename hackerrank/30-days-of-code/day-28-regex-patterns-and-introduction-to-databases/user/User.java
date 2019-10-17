import java.util.Set;
import java.util.HashSet;

public class User {

  String username;
  String password;
  int age;
  Set<Integer> orderIDs;

  public User(String userName, String password, int age, Set<Integer> orderIDs) {
    this.username = username;
    this.password = password;
    this.age = age;
    this.orderIDs = orderIDs;
  }

  public static void main(String[] args) {
    Set iDs = new HashSet<Integer>();
    iDs.add(1212);
    User sirCombs = new User("Grant", "secret_code", 10, iDs);
  }
}
