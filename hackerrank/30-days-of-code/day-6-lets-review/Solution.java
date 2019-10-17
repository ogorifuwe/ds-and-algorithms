class Solution {

  public static void main(String[] args) {
    
    java.util.Scanner stdIn = 
      new java.util.Scanner(System.in);

    int n = stdIn.nextInt();
    String[] arr = new String[n];

    int i = 0;
    while (i < n) {
      String str = stdIn.next();
      arr[i] = str;
      ++i;
    }

    for (int j = 0; j < arr.length; ++j) {   
      
      java.lang.StringBuffer sb1 = new java.lang.StringBuffer();
      java.lang.StringBuffer sb2 = new java.lang.StringBuffer();
      
      String tmp = arr[j];
      char[] content = tmp.toCharArray();
      
      for (int k = 0; k < content.length; ++k) {
        if (!(k % 2 == 0)) { sb2.append(content[k]); }
        else { sb1.append(content[k]); }
      }
      System.out.print(sb1.toString()+" "+sb2.toString()+"\n");
    }
  }
}
