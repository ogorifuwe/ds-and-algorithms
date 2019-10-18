class DateFashion {

  public int dateFashion(int you, int date) {
    int res = 1;
    if (you >= 8 || date >= 8) res = 2;
    if (you <= 2 || date <= 2) res = 0;
    return res;
  }

}
