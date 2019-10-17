public class GenericMethodsAndBoundedTypeParameters<T> {
  
  public static <T> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
      if (e > elem) // compiler error
        ++count
    return count;
  }

  /* fix for the above code */
  public interface Comparable<T> {
    public int compareTo(T o);
  }

  public static <T extends Comparable> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
      if (e.compareTo(elem) > 0)
        ++count;
    return count;
  }
}
