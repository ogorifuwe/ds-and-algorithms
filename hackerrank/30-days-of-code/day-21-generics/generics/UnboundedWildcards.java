import java.util.List;
import java.util.Arrays;

public class UnboundedWildcards {
  
  public static void printList0(List<Object> list) {
    for (Object elem : list)
      System.out.print(elem+" ");
    System.out.println();
  }

  public static void printList1(List<?> list) {
    for (Object o : list)
      System.out.print(o+" ");
    System.out.println();
  }

  public static void main(String[] args) {
    List<Integer> li = Arrays.asList(1, 2, 3);
    List<String> ls = Arrays.asList("one", "two", "three");

    //printList0(li); // error: incompatible types
    //printList0(ls); // error: incompatible types
    
    printList1(li);
    printList1(ls);
  }
}
