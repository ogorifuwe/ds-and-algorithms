public class StringReview {

  static char firstNonRepeating(String s) {
    
    char res = '*';

    char[] charArr = s.toCharArray();
    Map<Character, Integer> freq = new HashMap<>();


    for (int i = 0; i < charArr.length; ++i) {
      if (!freq.containsKey(charArr[i])) {
        freq.put(charArr[i], 1);
      } else {
          int val = freq.get(charArr[i]);
          freq.put(charArr[i], ++val);
      }

    }

    for (int j = 0; j < charArr.length; ++i) {
      if (freq.get(arr[j]) == 1) {
        res = charArr[i];
        break;
      }
    }

    return res;
  }


}
