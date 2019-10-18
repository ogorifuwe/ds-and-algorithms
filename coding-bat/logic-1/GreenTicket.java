class GreenTicket {

  public int greenTicket(int a, int b, int c) {
    int res = 0;
    if (a == b && b == c) res = 20;
    else if (a == b || b == c) res = 10;
    else if (!(a == b && b == c)) res = 0;
    return res;
  }
  
}
