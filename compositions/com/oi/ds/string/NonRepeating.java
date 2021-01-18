class NonRepeating {
  
  public static void main(String[] args) {
    
    char res = nonRepeating("abcab"); System.out.println(res);
    char res1 = nonRepeating("abab"); System.out.println(res1);
    char res2 = nonRepeating("aabbc"); System.out.println(res2);
    char res3 = nonRepeating("aabbdbc"); System.out.println(res3);
  }

  static char nonRepeating(String str) {
    
    char nonRepeatingChar = '*';

    java.util.Map<Character, Integer> charFreq = new java.util.HashMap<>();
    char[] charArr = str.toCharArray();

    for (int i = 0; i < charArr.length; ++i) {
      if (!charFreq.containsKey(charArr[i])) {
        charFreq.put(charArr[i], 1);
      } else {
        int val = charFreq.get(charArr[i]);
        charFreq.put(charArr[i], ++val);
      }
    }


    for (int i = 0; i < charArr.length; ++i) {
      if (charFreq.get(charArr[i]) == 1) {
        nonRepeatingChar = charArr[i];
        break;
      }
    }

    return nonRepeatingChar;
  }
}
