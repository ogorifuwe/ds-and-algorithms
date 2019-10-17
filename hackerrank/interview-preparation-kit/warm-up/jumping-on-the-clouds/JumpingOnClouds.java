public class JumpingOnClouds {

  static int jumpingOnClouds(int[] c) {
    int minJumps = -1;

    for (int i = 0; i < c.length; ++i, ++minJumps) {
      System.out.println("currPos: "+i + "\tminJumps:"+minJumps);
      if (i < c.length-2 && c[i+2] == 0) {
        ++i;
      }
    }
    return minJumps;
  }

  public static void main(String[] args) {
    int[] c = {0, 0, 1, 0, 0, 1, 0};
    //int[] c = {0, 0, 0, 0, 1, 0};
    int res = jumpingOnClouds(c);
    System.out.println(res);
  }
}
