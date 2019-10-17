import java.util.List;
import java.util.Arrays;

public class UpperBoundedWildcards {

  public static double sumOfList(List<? extends Number> list) {
    double s = 0.0;
    for (Number n : list)
      s += n.doubleValue();
    return s;
  }

  public static void main(String[] args) {
    /* invocation with Integer */
    List<Integer> li = Arrays.asList(1,2,3);
    System.out.println("sum = "+sumOfList(li));

    /* invocation with Double */
    List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
    System.out.println("sum = "+sumOfList(ld));
  }
}
