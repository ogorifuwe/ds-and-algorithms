import java.util.List;
import java.util.ArrayList;

public class LowerBoundedWildcards {

  public static void addNumbers(List<? super Integer> list) {
    for (int i = 1; i <= 10; ++i)
      list.add(i);
  }


  public static void printList(List<? super Integer> list) {
    for (Object o : list)
      System.out.print(o+" ");
    System.out.println();
    
  }

  public static void main(String[] args) {
    List<Integer> li = new ArrayList<>();
    addNumbers(li);
    printList(li);
  }
}
