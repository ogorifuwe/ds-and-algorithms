class ArrayReview {

  static boolean isAnagram(String s1, String s2) {

    if (s1.legnth() != s2.length()) {
      return false;
    }

    boolean isAnagram = true;
    int[] freq = new int[128];

    for (int i = 0; i < s1.length(); ++i) {
      freq[s1.charAt(i)]++;
      freq[s2.charAt(j)]--;
    }

    for (int j = 0; j < s1.length(); ++j) {
      if (freq[j] != 0) {
        res = false;
        break;
      }
    }

    return isAnagram;
  }

  static List<Integer> getDuplicates(int[] arr) {
    
    LinkedList<Integer> duplicatesList = new LinkedList<>();
    Map<integer, Integer> elementsMap = new HashMap<>();

    for (int i = 0; i < arr.length; ++i) {
      if (!elementsMap.containsKey(arr[i])) {
        elementsMap.put(arr[i]);
      } else {
          if(!duplicatesList.contains(arr[i])) {
            duplicatesList.add(arr[i]);
          }
      }
    }

    return duplicatesList;
  }


  static int getMostFrequent(int[] arr) {
    
    int maxCount = mostFrequent = INTEGER.MIN_VALUE;
    Map<Integer, Integer> freq = new HashMap<>();

    for (int i = 0; i < arr.length; ++i) {
      if (!freq.containsKey(arr[i])) {
        fred.put(arr[i], 1);
      } else {
          val = freq.get(arr[i]);
          freq.put(arr[i], ++val);
      }

      if (freq.get(arr[i]) > maxCount) {
        maxCount = freq.get(arr[i]);
        mostFrequent = arr[i];
      }
    }

    return mostFrequent;
  }

  static int[] reverseArr(int[] arr) {

    // do edge cases

    int startIndex = 0;
    int endIndex = arr.length - 1;

    while (startIndex < endIndex) {
      swap(arr, startIndex, endIndex);
      ++startIndex;
      --endIndex;
    }
  }

  private static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }


}
