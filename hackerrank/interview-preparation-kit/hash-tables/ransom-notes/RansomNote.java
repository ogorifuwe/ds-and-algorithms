class RansomNote {

  static void checkMagazine(String[] magazine, String[] note) {
    
    java.util.Hashtable<String, Integer> freq =
      new java.util.Hashtable<String, Integer>();

    for (String m : magazine) {
        if (freq.containsKey(m)) {
          freq.put(m, freq.get(m) + 1);
      } else {
        freq.put(m, 1);
      }
    }

    for (String n : note) {
      if (!freq.containsKey(n)) {
        System.out.println("No");
        return;
      }

      /* update count of word, since we're taking one out the magazine */
      int wordCount = freq.get(n)-1;

      /* check that count of word  is not zero  */
      if (!(wordCount == 0)) { freq.put(n, wordCount); }
      else { freq.remove(n); }
    }

    System.out.println("Yes");
    return;
  }

  public static void main(String[] args) {
    String[] magazine = {"i've", "got", "a", "lovely", "bunch", "of", "coconuts"};
    String[] note = {"i've", "got", "some", "coconuts"};

    checkMagazine(magazine, note);
  }
}
