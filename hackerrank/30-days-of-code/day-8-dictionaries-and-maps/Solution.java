class Solution {

  public static void main(String[] args) {
    
    java.util.Scanner stdIn =
                new java.util.Scanner(System.in);
    
    java.util.Map<String, Integer> map =
                new java.util.HashMap<String, Integer>();

    int n = stdIn.nextInt();
    
    for (int i = 0; i < n; ++i) {
      String name = stdIn.next();
      int phone = stdIn.nextInt();
      map.put(name, phone);
    }

    while (stdIn.hasNext()) {
      String s = stdIn.next();
      
      if (map.containsKey(s)) {
        System.out.print(s+"="+map.get(s)+"\n");
      } else {
          System.out.print("Not found\n");
      }
    }
  }
}
