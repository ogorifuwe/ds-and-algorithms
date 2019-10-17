import java.util.Arrays;

public class RuntimePractice {
    
  public static int numOfRepetitions(String s, char c) {
    int sum = 0;
    for (char ch : s.toCharArray()) {
      if (ch == c) ++sum;
    }
    return sum;
  }

  public static int[] numOfRepetitions1(String s, char[] c) {
    int[] sums = new int[c.length];
    for (int i = 0; i < s.length(); ++i) {
      for (int j = 0; j < c.length; ++j) {
        if (s.charAt(i) == c[j])
          sums[j]++;
      }
    }
    return sums;
  }

  public static int[] numOfRepetitions2(String s, char[] c) {
    int[] sums = new int[c.length];
    java.util.HashMap<Character, Integer> map =
                            new java.util.HashMap<Character, Integer>();

    for (char ch : s.toCharArray()) {
      if (!map.containsKey(ch)) {
        map.put(ch, 1);
      } else {
        map.put(ch, map.get(ch)+1);
      }
    }

    for (int i = 0; i < c.length; ++i) {
      if (!map.containsKey(c[i])) {
        sums[i] = 0;
      } else {
        sums[i] = map.get(c[i]);
      }
    }
    return sums;
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    System.out.println("num of times: "+numOfRepetitions("abca", 'a'));
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    System.out.println("runtime in ms: "+duration);
    
    String s = "cottonswabs springwaterloyoladay25ofcoderunningtimecomplexityAdMajoriemkkkkdhgsdyhgjfhvbnsghfdtywsu;swifgvhsgfgdfsadycghsjdcnvbhdsvcfsfdyfsakuydghbcdhsgcvystfyaufguyhfvghgdvcyusgfygygfytrgufgyugsyugfyagfugsfhfygygfhygfweyrtuilfbvfvsdgfdyfsdjjgiosughijrgpiu";
    char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};
    startTime = System.currentTimeMillis();
    System.out.println("num of times: "+Arrays.toString(numOfRepetitions1(s, a)));
    endTime = System.currentTimeMillis();
    duration = endTime - startTime;
    System.out.println("runtime in ms: "+duration);
    
    startTime = System.currentTimeMillis();
    System.out.println("num of times: "+Arrays.toString(numOfRepetitions2(s, a)));
    endTime = System.currentTimeMillis();
    duration = endTime - startTime;
    System.out.println("runtime in ms: "+duration);
  }
}
