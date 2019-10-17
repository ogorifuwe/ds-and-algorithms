public class TypeInference {
  
  static <T> T pick(T a1, T a2) { return a2; }
  Serializable s = pick("d", new ArrayList<String>());

}
