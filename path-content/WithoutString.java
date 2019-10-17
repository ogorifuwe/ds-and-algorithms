public class WithoutString {

  public static String withoutString(String base, String remove) {
    String result = "";
    
    int idx = base.toLowerCase().indexOf(remove.toLowerCase());
    while (idx != -1) {
      result += base.substring(0, idx);
      System.out.println(result);
      base = base.substring(idx + remove.length());
      System.out.println(base);
      idx = base.toLowerCase().indexOf(remove.toLowerCase());
      System.out.println(idx);
    }
  
    result += base;
    return result;
  }

  public static void main(String[] args) {
    String base = "Hello There", remove = "llo";

    String result = withoutString(base, remove);
    System.out.println(result);
  }
}
