public class AppBox<T> {
  public static void main(String[] args) {
    /*Box<Integer> intBox = new Box<>();
    Box rawBox = new Box();
   
    Box<String> stringBox = new Box<>();
    Box rawBox1 = stringBox;
    */

    /*Box rawBox2 = new Box();
    Box<Integer> intBox1 = rawBox2;
    */
    
    /*Box<String> stringBox1 = new Box<>();
    Box rawBox3 = stringBox1;
    rawBox3.set(8);
    */

    Box<Integer> integerBox = new Box<Integer>();
    integerBox.set(new Integer(10));
    //integerBox.inspect("Number");  // error: this is still String!
  }
}
