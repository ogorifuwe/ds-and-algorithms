class MyBook extends Book {

  int price;

  public MyBook(String title, String author, int price) {
    super(title, author);
    this.price = price;
  }

  void display() {
    System.out.print("Title: "+ title +
                     "\nAuthor: "+ author +
                     "\nPrice: "+ price +
                     "\n");
  }
}
