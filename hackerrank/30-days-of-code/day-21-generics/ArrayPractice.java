class ArrayPractice {

  static <E> void printArray(E[] arr) {
    System.out.print("[ ");
      for ( E el : arr) {
        System.out.print(el+" ");
      }
    System.out.print("]\n");
  }

  public static void main(String[] args) {
    Integer[] arr0 = {1, 2, 3, 4, 5};
    Character[] arr1 = {'a', 'b', 'c', 'd', 'e'};
    String[] arr2 = {"aye", "bae", "car", "dot", "eye"};

    printArray(arr0);
    printArray(arr1);
    printArray(arr2);
  }
}
