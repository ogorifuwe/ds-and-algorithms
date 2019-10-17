class BinaryString1 {
  
  BinaryString1(String string, Integer integer) {
    //String binaryInteger = Integer.toBinaryString(integer);

    for (byte b : string.getBytes()) {
      /* perform a bitwise operation using byte and integer operands,
       * save result as tmp: */
      //System.out.println("b: "+b+" integer: "+integer);
      int tmp = b | integer;
      System.out.println(Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer)
          + " = "+Integer.toBinaryString(tmp)+" = "+tmp);
    }
  }

  public static void main(String[] args) {
    new BinaryString1("HackerRank", 8675309);
  }
}
